public void end(java.lang.String dialog) {
    int optionChoisie = javax.swing.JOptionPane.showConfirmDialog(null, "The program will now shut down", "", javax.swing.JOptionPane.OK_CANCEL_OPTION);
    if (optionChoisie == (javax.swing.JOptionPane.OK_OPTION)) {
        if (dialog == null) {
            imp.close();
            leRoi.close();
        }
        if (dialog == "dialog") {
            leRoi.close();
        }
    }
}