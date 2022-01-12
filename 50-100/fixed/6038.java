public void readFile(java.io.File file) {
    cssFile.readFile();
    root = cssFile.getTree();
    createTree(root);
    treePanel.updateTree();
    updateTitle(cssFile.getName());
    rightPanel.setHeader(cssFile.getName());
    codePanel.updatePanel(cssFile);
    saveAsItem.setEnabled(true);
    saveAsButton.setEnabled(true);
}