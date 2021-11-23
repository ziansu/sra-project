@java.lang.Override
public void run() {
    android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(hu.xmister.hermestool.OtherFragment.a);
    builder.setTitle(getString(R.string.missing_binaries)).setMessage(getString(R.string.missing_binaries_message)).show();
}