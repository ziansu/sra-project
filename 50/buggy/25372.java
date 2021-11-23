@java.lang.Override
public void onResume() {
    super.onResume();
    android.util.Log.i(TAG, "MainActivity.onResume()");
    mTextView = ((android.widget.TextView) (findViewById(R.id.msg_view)));
    startServer();
}