private void saveUserFile() {
    try {
        net.druidia.persistence.entities.user.file.FileCompletionHandler.dataSvc.saveUserFile(userFile);
        net.druidia.web.common.helpers.MessagesHelper.showInfoMsg((("File: " + (userFile.getFileName())) + "has been uploaded successfully."));
    } catch (net.druidia.exceptions.DruidiaException e) {
        net.druidia.persistence.entities.user.file.FileCompletionHandler.log.error(e.getMessage());
    }
}