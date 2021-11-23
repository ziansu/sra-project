public void saveTempArtical(java.lang.String title, java.lang.String html) {
    artical.finished = 0;
    save(title, html);
    com.example.administrator.yoursecret.AppManager.ApplicationDataManager.getInstance().getRecordDataManager().saveTempArtical(artical);
    saveToDatabase();
    com.example.administrator.yoursecret.AppManager.AppDatabaseManager.saveImages(com.example.administrator.yoursecret.Editor.Manager.EditorDataManager.getInstance().getPhotoManager().getImages());
}