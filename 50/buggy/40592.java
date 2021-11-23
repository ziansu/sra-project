public void addAllParts() {
    for (int i = 1; i <= ((((size) - 1) / (ClientFileInfo.SIZE_OF_FILE_PIECE)) + 1); i++) {
        partsOfFile.add(i);
    }
}