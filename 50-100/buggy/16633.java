@java.lang.Override
public void decoded(byte[] newData) {
    final java.lang.String text = new java.lang.String(newData);
    android.util.Log.d("WaterLevel", text);
    runOnUiThread(new java.lang.Runnable() {
        public void run() {
            mTerminal.setText(((mTerminal.getText()) + text));
            if (mScrollLock) {
                mScroll.fullScroll(ScrollView.FOCUS_DOWN);
            }
        }
    });
}