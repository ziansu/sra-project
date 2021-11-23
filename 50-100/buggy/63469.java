public void addRecord(com.experiment.chickenjohn.materialdemo.EcgData ecgData) {
    int dataId;
    dataId = ecgData.getDataId();
    if (((dataId % 500) != 0) || (dataId == 0)) {
        ecgDataTemp[(dataId % 500)] = ecgData;
    }else {
        com.experiment.chickenjohn.materialdemo.EcgDatabaseManager.dataInsertingThread dataInsertingThread = new com.experiment.chickenjohn.materialdemo.EcgDatabaseManager.dataInsertingThread();
        dataInsertingThread.run(ecgData);
        android.util.Log.v("database inserting", ("inserting " + (java.lang.Integer.toString(ecgData.getDataId()))));
    }
}