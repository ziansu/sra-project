@java.lang.Override
public void setVisible(boolean makeVisible) {
    this.hiddenDialog.setVisible(makeVisible);
    this.hiddenDialog.setEnabled(false);
    super.setVisible(makeVisible);
}