private java.lang.String setupDstByDirectory(java.lang.String directory) {
    int fileNameIndex = VCF_FILE_PATH.lastIndexOf("/");
    if (fileNameIndex == (-1)) {
        fileNameIndex = VCF_FILE_PATH.lastIndexOf("\\");
    }
    java.lang.String output = directory + (VCF_FILE_PATH.substring(fileNameIndex));
    return (output.substring(0, ((output.length()) - 3))) + "csv";
}