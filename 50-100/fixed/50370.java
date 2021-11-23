public void initDatabase(android.content.Context context) throws java.io.IOException {
    com.android.angrybird.database.DaoMaster.DevOpenHelper helper = new com.android.angrybird.database.DaoMaster.DevOpenHelper(context, "angrybird-db");
    org.greenrobot.greendao.database.Database db = helper.getWritableDb();
    daoSession = new com.android.angrybird.database.DaoMaster(db).newSession();
    if ((com.android.angrybird.util.FileUtils.checkIfDbExist()) && (!(com.android.angrybird.util.FileUtils.checkIfImageDirExist(context)))) {
        com.android.angrybird.util.FileUtils.copyDatabaseToInternalStorage(context);
        org.apache.commons.io.FileUtils.copyDirectory(com.android.angrybird.util.FileUtils.creatImagesFolderExternalStorage(), com.android.angrybird.util.FileUtils.createImageDir(context));
    }
}