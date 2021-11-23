private void showWarning(int errorTitle, int errorMessage) {
    new android.support.v7.app.AlertDialog.Builder(getActivity()).setTitle(errorTitle).setMessage(errorMessage).setPositiveButton(R.string.OK, null).create().show();
}