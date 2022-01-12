private void desconectar() {
    if ((this.socket) != null) {
        try {
            this.socket.close();
            this.btnConectar.setEnabled(true);
            this.btnDesconectar.setEnabled(false);
            java.lang.System.out.println("Communication finished");
            javax.swing.JOptionPane.showMessageDialog(this, "Communication finished");
        } catch (java.io.IOException event) {
            java.lang.System.out.println((("Error: [" + (event.getMessage())) + "]"));
        }
    }
}