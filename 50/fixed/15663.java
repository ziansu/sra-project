@java.lang.Override
public void run() {
    com.pimpimmobile.librealarm.nightscout.NightscoutUploader uploader = new com.pimpimmobile.librealarm.nightscout.NightscoutUploader(this);
    java.util.List<com.pimpimmobile.librealarm.shareddata.PredictionData> result = uploader.upload(data);
    mDatabase.setNsSynced(result);
    super.run();
}