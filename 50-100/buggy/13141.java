private void saveUserFile() {
    try {
        net.druidia.persistence.entities.user.file.FileCompletionHandler.dataSvc.saveUserFile(userFile);
        net.druidia.persistence.entities.user.file.FileCompletionHandler.log.info((((net.druidia.web.common.helpers.SecurityHelper.getUsername()) + " has uploaded and saved image: ") + (userFile)), true);
        net.druidia.web.common.helpers.MessagesHelper.showInfoMsg((("File: " + (userFile.getFileName())) + "has been uploaded successfully."));
    } catch (net.druidia.exceptions.DruidiaException e) {
        net.druidia.persistence.entities.user.file.FileCompletionHandler.log.error(e.getMessage());
    }
}