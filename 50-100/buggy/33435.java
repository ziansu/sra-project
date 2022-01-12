@java.lang.Override
public void onMove(int angle, int strength) {
    mTextViewAngleLeft.setText((angle + "°"));
    mTextViewStrengthLeft.setText((strength + "%"));
    com.example.android.bluetoothlegatt.ConnectedThread mConnectedThread = new com.example.android.bluetoothlegatt.ConnectedThread();
    if (0 == angle) {
        mConnectedThread.write("1");
        android.widget.Toast.makeText(getBaseContext(), "Turns Right", Toast.LENGTH_SHORT).show();
    }
}