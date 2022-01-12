private void selectRandomFilesRegardingBytes(java.util.List<java.io.File> files, long allFilesBytes) {
    int selectedIndex;
    long fileLength;
    long bytesToRegard = allFilesBytes;
    while (allFilesBytes > (getMaxBytesToCopy())) {
        selectedIndex = rnd.nextInt(files.size());
        files.remove(selectedIndex);
        fileLength = files.get(selectedIndex).length();
        bytesToRegard -= fileLength;
    } 
    copiedBytes = bytesToRegard;
    randomFiles.addAll(files);
}