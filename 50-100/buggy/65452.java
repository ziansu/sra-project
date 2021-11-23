public void windowActivated(java.awt.event.WindowEvent event) {
    megan.viewer.MainViewer.setLastActiveFrame(getFrame());
    if ((java.util.Formatter.getInstance()) != null) {
        java.util.Formatter.getInstance().setViewer(dir, this);
    }
    megan.dialogs.input.InputDialog inputDialog = megan.dialogs.input.InputDialog.getInstance();
    if (inputDialog != null)
        inputDialog.setViewer(dir, this);
    
    this.requestFocus();
}