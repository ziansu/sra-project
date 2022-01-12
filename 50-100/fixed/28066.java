@java.lang.Override
public void onClick(android.view.View v) {
    if (btnPublish.getText().toString().contentEquals("stop")) {
        mPublisher.stopPublish();
        mPublisher.stopRecord();
        btnPublish.setText("publish");
        btnRecord.setText("record");
        btnSwitchEncoder.setEnabled(true);
    }
}