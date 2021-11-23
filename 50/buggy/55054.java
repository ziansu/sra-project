public static boolean isNewFile(final java.nio.file.Path localFile, final com.spectralogic.ds3client.models.Contents serverFile, final boolean isPutCommand) throws java.io.IOException {
    return com.spectralogic.ds3cli.util.SyncUtils.isNewFileHelper(java.nio.file.Files.getLastModifiedTime(localFile).toString(), serverFile.getLastModified().toString(), isPutCommand);
}