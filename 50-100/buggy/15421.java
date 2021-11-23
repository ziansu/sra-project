protected void startRecording(int startId) {
    com.kivSW.phonerecorder.DataModule dm = com.kivSW.phonerecorder.DataModule.getInstance(this);
    if ((dm.getPhoneNumber().indexOf('*')) >= 0)
        return ;
    
    convRecorder.start(dm);
    currentStartId = startId;
    getNotificationOfCallProcessing().show(getText(R.string.start_recording).toString());
}