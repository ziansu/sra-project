public void onShowEggProgressCircle(boolean cancelable) {
    mDialogView = new android.app.Dialog(mContext);
    mDialogView.requestWindowFeature(Window.FEATURE_NO_TITLE);
    mDialogView.setContentView(R.layout.circular_progress);
    mDialogView.getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(android.graphics.Color.TRANSPARENT));
    mDialogView.setCancelable(cancelable);
    mDialogView.setCanceledOnTouchOutside(cancelable);
    mDialogView.show();
}