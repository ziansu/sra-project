static int init(java.nio.file.Path tmpFile) throws java.lang.Throwable {
    if (org.apache.lucene.util.Constants.LINUX) {
        return org.elasticsearch.bootstrap.Seccomp.linuxImpl();
    }else
        if (org.apache.lucene.util.Constants.MAC_OS_X) {
            org.elasticsearch.bootstrap.Seccomp.macImpl(tmpFile);
            return 1;
        }else {
            throw new java.lang.UnsupportedOperationException((("syscall filtering not supported for OS: '" + (org.apache.lucene.util.Constants.OS_NAME)) + "'"));
        }
    
}