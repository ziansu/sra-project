public void saveUpdate() {
    controller.CdController cCd = new controller.CdController(this);
    try {
        if (cCd.update()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Cd Modificato!", "Info!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
    } catch (java.lang.Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, e.getMessage(), "Errore!", javax.swing.JOptionPane.ERROR_MESSAGE);
    }
    caller.setEnabled(true);
    caller.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
    dispose();
}