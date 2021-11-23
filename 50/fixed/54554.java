private void btnEditBuildActionPerformed(java.awt.event.ActionEvent evt) {
    new ManageBuild(currentUser, null).setVisible(true);
    this.setVisible(false);
}