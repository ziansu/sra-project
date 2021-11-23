public java.util.List<java.io.File> getEmlFiles() {
    return new netspy.components.filehandling.manager.FileManager().getFilesByExtension(netspy.components.mailing.EmailHandler.EML_FILE_EXTENSION);
}