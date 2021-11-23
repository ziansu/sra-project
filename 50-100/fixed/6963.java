private void writeToFile(java.lang.String stringToFile) throws tasknote.shared.TaskListIOException {
    try {
        byte[] bufferMemory = stringToFile.getBytes();
        int totalNumberOfBytesToWrite = bufferMemory.length;
        int maxWriteLength = magicValuesRetriever.getBufferSize();
        java.io.BufferedOutputStream fileWriter = new java.io.BufferedOutputStream(new java.io.FileOutputStream(tasknote.storage.FileManipulation.textFile));
        loopWriteOneObjectToFile(bufferMemory, totalNumberOfBytesToWrite, maxWriteLength, fileWriter);
        fileWriter.close();
    } catch (java.io.IOException ioe) {
        throw new tasknote.shared.TaskListIOException();
    }
}