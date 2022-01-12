@java.lang.Override
protected void onResume() {
    super.onResume();
    com.bquiet.bquiet.manager.RecorderManager.Ear ear = recorderManager.new com.bquiet.bquiet.activities.Ear();
    recorderManager.setListening(true);
    ear.execute();
}