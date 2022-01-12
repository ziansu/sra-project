public void deleteFile(java.io.File file) {
    if (!(file.delete())) {
        ru.alee.software.testtask.model.FileManager.logger.error("Can't delete file.");
    }
    (progress)++;
}