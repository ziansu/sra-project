private java.nio.file.Path getJarFileNameOnCluster(java.lang.String nodeId, java.lang.String jarFileName) {
    if (nodeId.equals(pl.edu.uj.jarpath.JarPathManager.currentNodeId))
        return java.nio.file.Paths.get(jarFileName);
    
    return java.nio.file.Paths.get((((("EXT" + "__") + nodeId) + "__") + jarFileName));
}