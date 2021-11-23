private void showSnackbar(@android.support.annotation.StringRes
int messageId) {
    android.support.design.widget.Snackbar.make(getView(), messageId, Snackbar.LENGTH_SHORT).show();
}