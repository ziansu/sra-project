public void cleanUp(org.m2latex.core.DirNode orgNode, java.io.File texDir) {
    orgNode.cleanUpRec(new org.m2latex.core.DirNode(texDir, this));
}