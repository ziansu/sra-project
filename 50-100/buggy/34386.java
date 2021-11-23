private void quit() {
    if ((imageEdited) == false) {
        javax.swing.JOptionPane.showMessageDialog(guiToEdit.frame, "Thank you for using this program.");
        java.lang.System.exit(0);
    }else
        if ((imageEdited) == true) {
            this.handleExitWhenFileNotSaved("Save work before exit?", "Paint");
        }
    
}