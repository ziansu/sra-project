@java.lang.Override
public void onClick(android.view.View v) {
    mRscpService.getSupportedFeature();
    mStateProgressBar.setVisibility(View.VISIBLE);
    mStateTextView.setText(com.example.android.bluetoothlegatt.RSCPActivity.EXEC);
}