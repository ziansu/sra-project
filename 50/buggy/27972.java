private java.lang.String extractPath(final com.yet.dsync.dto.LocalFolderData changeData) {
    final java.lang.String dropboxPath = localFolderService.extractDropboxPath(changeData.getPath());
    return dropboxPath;
}