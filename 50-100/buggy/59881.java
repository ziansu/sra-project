private javax.swing.tree.DefaultMutableTreeNode createDirStructure(java.io.File parent) {
    javax.swing.tree.DefaultMutableTreeNode parentNode = new javax.swing.tree.DefaultMutableTreeNode(parent.getName());
    if (parent.isDirectory()) {
        for (java.io.File file : parent.listFiles()) {
            javax.swing.tree.DefaultMutableTreeNode tempNode = new javax.swing.tree.DefaultMutableTreeNode(file.getName());
            if (file.isDirectory()) {
                tempNode.add(createDirStructure(file));
            }
            parentNode.add(tempNode);
        }
    }
    return parentNode;
}