public hdfs.jsr203.IAttributeReader getView(hdfs.jsr203.HadoopPath path, java.lang.String type) {
    if ("basic".equals(type))
        return new hdfs.jsr203.HadoopBasicFileAttributeView(path, false);
    
    if ("hadoop".equals(type))
        return new hdfs.jsr203.HadoopBasicFileAttributeView(path, true);
    
    if ("owner".equals(type))
        return new hdfs.jsr203.HadoopPosixFileAttributeView(path, false);
    
    if ("posix".equals(type))
        return new hdfs.jsr203.HadoopPosixFileAttributeView(path, true);
    
    return null;
}