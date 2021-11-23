private java.lang.String extractPath(final com.yet.dsync.dto.LocalFolderData changeData) {
    return localFolderService.extractDropboxPath(changeData.getPath());
}