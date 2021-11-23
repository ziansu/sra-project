private void removeSuffix() throws java.io.IOException {
    java.io.File oldFile = new java.io.File(mSavePath);
    java.io.File newFile = new java.io.File(origSavePath);
    java.nio.file.Files.move(oldFile.toPath(), newFile.toPath());
}