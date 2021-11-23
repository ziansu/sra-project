public void closeWithSuccess() {
    java.lang.System.out.println("Compra exitosa");
    java.lang.Thread t = new java.lang.Thread(new java.lang.Runnable() {
        public void run() {
            javax.swing.JOptionPane.showMessageDialog(null, "La compra ha sido exitosa", "Éxito!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
    });
    t.start();
    java.lang.System.out.println("After option pane");
    this.setVisible(false);
}