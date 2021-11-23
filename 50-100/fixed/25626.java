private void desconectar() {
    if ((this.socket) != null) {
        try {
            this.socket.close();
            this.btnConectar.setEnabled(true);
            this.btnDesconectar.setEnabled(false);
            this.label.setText("Communication finished");
            javax.swing.JOptionPane.showMessageDialog(this, "Communication finished");
        } catch (java.io.IOException event) {
            this.label.setText((("Error: [" + (event.getMessage())) + "]"));
        }
    }
}