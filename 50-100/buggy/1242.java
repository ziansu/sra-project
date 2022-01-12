public synchronized java.io.File prepareConfigDir(java.lang.String strRelativePath) {
    java.lang.String filePath = ((getBaseBuildWorkingDirectory()) + (java.io.File.separator)) + strRelativePath;
    java.io.File f = new java.io.File(filePath);
    f.setReadable(true, true);
    f.setWritable(true, true);
    f.setExecutable(false, false);
    f.mkdir();
    return f;
}