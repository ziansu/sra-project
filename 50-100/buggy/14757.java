private void showErrorDialog() {
    final com.liteon.icampusguardian.util.CustomDialog dialog = new com.liteon.icampusguardian.util.CustomDialog();
    dialog.setTitle("帳號不正確，請再確認！");
    dialog.setIcon(R.drawable.ic_error_outline_black_24dp);
    dialog.setBtnText("好");
    dialog.setBtnConfirm(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            dialog.dismiss();
        }
    });
    dialog.show(getSupportFragmentManager(), "dialog_fragment");
}