static maxim.z.FileSystem getFileSystem(maxim.z.BytesReaderWriter readerWriter, int clusterCount, int clusterSize) throws java.io.IOException {
    return new maxim.z.FileSystem(readerWriter, clusterCount, clusterSize);
}