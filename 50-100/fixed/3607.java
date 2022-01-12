private java.io.File getNameNodeDir() {
    java.lang.String dir = node.hdfsSiteOpts.get("dfs.name.dir");
    if (dir == null)
        dir = node.hdfsSiteOpts.get("dfs.namenode.name.dir");
    
    if (dir == null)
        dir = new java.io.File(getTmpDir(), "dfs/name").getPath();
    
    return new java.io.File(dir.split(",")[0]);
}