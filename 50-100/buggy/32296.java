public hdfs.jsr203.IAttributeReader getView(hdfs.jsr203.HadoopPath path, java.lang.String type) {
    if (type == null)
        throw new java.lang.NullPointerException();
    
    if (type.equals("basic"))
        return new hdfs.jsr203.HadoopBasicFileAttributeView(path, false);
    
    if (type.equals("hadoop"))
        return new hdfs.jsr203.HadoopBasicFileAttributeView(path, true);
    
    if (type.equals("owner"))
        return new hdfs.jsr203.HadoopPosixFileAttributeView(path, false);
    
    if (type.equals("posix"))
        return new hdfs.jsr203.HadoopPosixFileAttributeView(path, true);
    
    return null;
}