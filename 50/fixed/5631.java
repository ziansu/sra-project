private void connectToDatabase() throws java.io.IOException, storage.BadFileContentException {
    storage.Configuration setting = storage.Configuration.getInstance();
    java.lang.String fileDir = setting.getUsrFileDirectory();
    storage.Database.connect(fileDir);
    storage.Database.load();
}