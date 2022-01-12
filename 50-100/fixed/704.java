private void syncNightscout() {
    final java.util.List<com.pimpimmobile.librealarm.shareddata.PredictionData> data = mDatabase.getNsSyncData();
    new java.lang.Thread() {
        @java.lang.Override
        public void run() {
            com.pimpimmobile.librealarm.nightscout.NightscoutUploader uploader = new com.pimpimmobile.librealarm.nightscout.NightscoutUploader(com.pimpimmobile.librealarm.WearService.this);
            java.util.List<com.pimpimmobile.librealarm.shareddata.PredictionData> result = uploader.upload(data);
            mDatabase.setNsSynced(result);
            super.run();
        }
    }.start();
}