@java.lang.Override
public void onClick(android.view.View v) {
    mStateProgressBar.setVisibility(View.VISIBLE);
    mStateTextView.setText(com.example.android.bluetoothlegatt.RSCPActivity.EXEC);
    mRscpService.getSensorLocation();
}