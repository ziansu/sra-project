public void actionPerformed(java.awt.event.ActionEvent event) {
    currentlySelectedNode = ((javax.swing.tree.DefaultMutableTreeNode) (tree.getLastSelectedPathComponent()));
    if ((currentlySelectedNode.getLevel()) == 5) {
        Email removeEmail = ((Email) (currentlySelectedNode.getUserObject()));
        if (EmailManager.deleteEmail(removeEmail)) {
            GUIAccountTreeManager.DeleteEmail(currentlySelectedNode, model);
            screen.setText("");
            tree.clearSelection();
        }
    }
    removeButton.setEnabled(false);
}