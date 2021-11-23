protected java.lang.String generateProcessedFileName(java.lang.String inFileBefore, java.lang.String outName) {
    java.lang.String outFile;
    if ((outName == "") || (outName == null)) {
        outFile = ((ppFilesLoc) + (java.lang.System.getProperty("file.separator"))) + (new java.io.File(inFileBefore).getName());
    }else {
        outFile = ((ppFilesLoc) + (java.lang.System.getProperty("file.separator"))) + outName;
    }
    return outFile;
}