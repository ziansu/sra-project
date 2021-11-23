@java.lang.Override
public void onBackPressed() {
    mConnection.setBound(false);
    super.onBackPressed();
}