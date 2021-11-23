private void selectRandomFilesRegardingBytes(java.util.List<java.io.File> files, long allFilesBytes) {
    int selectedIndex;
    long fileLength;
    while (allFilesBytes > (getMaxBytesToCopy())) {
        selectedIndex = rnd.nextInt(files.size());
        files.remove(selectedIndex);
        fileLength = files.get(selectedIndex).length();
        allFilesBytes -= fileLength;
    } 
    copiedBytes = allFilesBytes;
    randomFiles.addAll(files);
}