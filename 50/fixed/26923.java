public void setTreeName(java.lang.String treeName) {
    this.treeName.setText(treeName);
    cleanButton.setEnabled(treeName.equals("ACTIVE"));
    treeButtonsContainer.revalidate();
    treeButtonsContainer.repaint();
}