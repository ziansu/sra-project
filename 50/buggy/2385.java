@java.lang.Override
public void onPause() {
    super.onPause();
    if (sbError.isShown()) {
        sbError.dismiss();
    }
}