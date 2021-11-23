public static long getOffsetLagForFile(java.lang.String fileOffsetString) throws java.io.IOException {
    long offset = com.streamsets.pipeline.lib.util.FileContextProviderUtil.getLongOffsetFromFileOffset(fileOffsetString);
    com.streamsets.pipeline.lib.io.LiveFile file = com.streamsets.pipeline.lib.util.FileContextProviderUtil.getRefreshedLiveFileFromFileOffset(fileOffsetString);
    if (file == null) {
        return 0L;
    }
    long fileSizeInBytes = java.nio.file.Files.size(file.getPath().toAbsolutePath());
    return fileSizeInBytes - offset;
}