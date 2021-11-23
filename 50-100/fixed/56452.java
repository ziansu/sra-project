public void end(java.lang.String dialog) {
    if (dialog == null) {
        int optionChoisie = javax.swing.JOptionPane.showConfirmDialog(null, "The program will now shut down", "", javax.swing.JOptionPane.OK_CANCEL_OPTION);
        if (optionChoisie == (javax.swing.JOptionPane.OK_OPTION)) {
            if (dialog == null) {
                imp.close();
                leRoi.close();
            }
        }
    }else
        if (dialog == "dialog") {
            leRoi.close();
        }
    
}