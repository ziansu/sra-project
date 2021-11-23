private java.lang.String[] collectSubtitleFileNames(java.lang.String directoryPath) {
    if (directoryPath == null) {
        return new java.lang.String[]{  };
    }
    java.util.Collection<java.io.File> files = org.apache.commons.io.FileUtils.listFiles(new java.io.File(directoryPath), new org.apache.commons.io.filefilter.RegexFileFilter("^(.*\\.srt?)"), org.apache.commons.io.filefilter.DirectoryFileFilter.DIRECTORY);
    java.lang.String[] fileNames = new java.lang.String[files.size()];
    int index = 0;
    for (java.io.File file : files) {
        fileNames[(index++)] = file.toString();
    }
    return fileNames;
}