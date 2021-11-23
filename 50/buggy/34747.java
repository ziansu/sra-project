private boolean rotationThresholdExceeded() {
    return (((rotationThresholdBytes) == 0) || (!(fileSystem.fileExists(outputFile)))) || ((fileSystem.getFileSize(outputFile)) >= (rotationThresholdBytes));
}