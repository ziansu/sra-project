private void fillRightTree(java.util.List<org.jetbrains.idea.maven.model.MavenArtifactNode> mavenArtifactNodes) {
    rightTreeRoot.removeAllChildren();
    for (org.jetbrains.idea.maven.model.MavenArtifactNode mavenArtifactNode : mavenArtifactNodes) {
        krasa.mavenrun.analyzer.MyTreeUserObject userObject = krasa.mavenrun.analyzer.MyTreeUserObject.create(mavenArtifactNode);
        userObject.showOnlyVersion = true;
        final javax.swing.tree.DefaultMutableTreeNode newNode = new javax.swing.tree.DefaultMutableTreeNode(userObject);
        fillRightTree(mavenArtifactNode, newNode);
        rightTreeRoot.add(newNode);
    }
    rightTreeModel.nodeStructureChanged(rightTreeRoot);
    krasa.mavenrun.analyzer.TreeUtils.expandAll(rightTree);
}