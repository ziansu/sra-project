@java.lang.Override
public void onClick(android.view.View v) {
    if (btnPublish.getText().toString().contentEquals("stop")) {
        mPublisher.stopPublish();
        mPublisher.stopRecord();
        com.tom.cococar.StopTask stop = new com.tom.cococar.StopTask();
        stop.executeOnExecutor(com.tom.cococar.CameraActivity.THREAD_POOL_EXECUTOR, marker_id);
        btnPublish.setText("publish");
        btnRecord.setText("record");
        btnSwitchEncoder.setEnabled(true);
        android.content.Intent intent;
        intent = new android.content.Intent(this, com.tom.cococar.MapsActivity.class);
        startActivity(intent);
    }
}