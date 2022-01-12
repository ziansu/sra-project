@java.lang.Override
public void dismissProgressDialog() {
    if ((progress) != null) {
        progress.dismiss();
        progress = null;
    }
}