private static boolean isLeafVersionDirectory(java.io.File subDirectory) {
    boolean isLeafVersionDirectory;
    java.util.Collection<java.io.File> subDirectories = org.apache.commons.io.FileUtils.listFilesAndDirs(subDirectory, ((org.apache.commons.io.filefilter.IOFileFilter) (org.apache.commons.io.filefilter.DirectoryFileFilter.DIRECTORY)), org.apache.commons.io.filefilter.TrueFileFilter.INSTANCE);
    isLeafVersionDirectory = ((subDirectories.size()) > 1) ? false : true;
    return isLeafVersionDirectory;
}