private org.apache.hadoop.fs.Path getRealHDFSPath(java.lang.String resourcePath) {
    if (resourcePath.equals("/"))
        return this.hdfsMetaPath;
    
    if ((resourcePath.startsWith("/")) && ((resourcePath.length()) > 1))
        resourcePath = resourcePath.substring(1, resourcePath.length());
    
    return new org.apache.hadoop.fs.Path(this.hdfsMetaPath, resourcePath);
}