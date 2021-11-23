public static hdfs.jsr203.attribute.HadoopFileAttributeView getView(hdfs.jsr203.HadoopPath path, java.lang.String type) {
    if (type == null)
        throw new java.lang.NullPointerException();
    
    if (type.equals("basic"))
        return new hdfs.jsr203.attribute.HadoopFileAttributeView(path, false);
    
    if (type.equals("hadoop"))
        return new hdfs.jsr203.attribute.HadoopFileAttributeView(path, false);
    
    return null;
}