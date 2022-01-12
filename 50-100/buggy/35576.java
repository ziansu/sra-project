public void saveTempArtical(java.lang.String html) {
    artical.finished = 0;
    save(html);
    com.example.administrator.yoursecret.AppManager.ApplicationDataManager.getInstance().getRecordDataManager().saveTempArtical(artical);
    saveToDatabase();
    com.example.administrator.yoursecret.AppManager.AppDatabaseManager.saveImages(com.example.administrator.yoursecret.Editor.Manager.EditorDataManager.getInstance().getPhotoManager().getImages());
}