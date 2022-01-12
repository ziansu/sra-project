private void showExitDialog() {
    dialog = new cn.pedant.SweetAlert.SweetAlertDialog(this, cn.pedant.SweetAlert.SweetAlertDialog.WARNING_TYPE).setTitleText(getString(R.string.dialog_close_app_title)).setContentText(getString(R.string.dialog_close_app_message)).setConfirmText(getString(R.string.yes)).setConfirmClickListener(new cn.pedant.SweetAlert.SweetAlertDialog.OnSweetClickListener() {
        @java.lang.Override
        public void onClick(cn.pedant.SweetAlert.SweetAlertDialog sweetAlertDialog) {
            endActivity();
        }
    }).setCancelText(getString(R.string.cancel)).showCancelButton(true);
    dialog.show();
}