private void tappedSaveButton() {
    this.getMenuModel().save("");
    this.getMenuView().showSaveDialog(javax.swing.JFileChooser.DIRECTORIES_ONLY);
    return ;
}