static void askToSave() {
    java.lang.String[] options = new java.lang.String[]{ "Yes" , "No" , "Cancel" };
    int n = javax.swing.JOptionPane.showOptionDialog(EssayWriter.frame, "Would you like to save before you exit?", "Save?", javax.swing.JOptionPane.YES_NO_CANCEL_OPTION, javax.swing.JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
    if (n == (javax.swing.JOptionPane.YES_OPTION)) {
        EssayWriter.save();
    }else
        if (n == (javax.swing.JOptionPane.NO_OPTION)) {
            java.lang.System.exit(0);
        }
    
}