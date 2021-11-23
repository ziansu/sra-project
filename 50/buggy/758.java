private java.lang.String ensureTrailingSeparator(java.lang.String imageDirectory) {
    if ((imageDirectory.charAt(((imageDirectory.length()) - 1))) != (java.io.File.separatorChar)) {
        imageDirectory = imageDirectory + "/";
    }
    return imageDirectory;
}