public void setErrorMode(java.lang.String msg, java.lang.String file, int line) {
    this.menuBarControl.updateUndoRedo(this.leftPanelControl.getSourcePane(), false);
    this.leftPanelControl.setErrorMode(file, line);
    this.rightPanelControl.showErrorPanel(msg);
}