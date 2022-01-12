private void saveToFile(java.io.File folder) {
    com.github.peejweej.androidsideloading.utilities.ShareManager.copyFile(new java.io.File(sideLoadInformation.getUri().getPath()), new java.io.File(folder, sideLoadInformation.fileName));
}