public java.util.List<java.lang.String> getUserFileNames(int maxFilesToReturn) throws java.io.IOException {
    java.util.List<java.lang.String> ret = new java.util.ArrayList<java.lang.String>();
    getFilesHelper(new org.apache.hadoop.fs.Path(_instance_root), "", com.backtype.hadoop.pail.AbstractPail.EXTENSION, true, ret, maxFilesToReturn);
    return ret;
}