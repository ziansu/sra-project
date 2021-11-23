@java.lang.Override
public void run() {
    info.setText(getString(R.string.serverIpNotSet));
    android.widget.Toast.makeText(this, R.string.ipNotReached, Toast.LENGTH_LONG).show();
}