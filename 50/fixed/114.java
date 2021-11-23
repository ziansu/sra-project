public void cleanUp(org.m2latex.core.DirNode orgNode, java.io.File texDir) {
    cleanUpRec(orgNode, new org.m2latex.core.DirNode(texDir, this));
}