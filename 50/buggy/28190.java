@java.lang.Override
public void showEmptyList() {
    makeToast(getResources().getString(R.string.list_is_empty), Snackbar.LENGTH_INDEFINITE);
}