@java.lang.Override
public void onResume() {
    super.onResume();
    mTextView = ((android.widget.TextView) (findViewById(R.id.msg_view)));
    startServer();
}