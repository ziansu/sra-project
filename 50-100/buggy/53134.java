private void initDialog(android.content.Context context) {
    android.support.v7.app.AlertDialog.Builder builder = new android.support.v7.app.AlertDialog.Builder(context);
    android.view.View view = android.view.LayoutInflater.from(context).inflate(R.layout.view_progress_bar_dialog, null, false);
    tv = ((android.widget.TextView) (view.findViewById(R.id.tv)));
    builder.setView(view);
    dialog = builder.create();
    isCanceledOnTouchOutside = sooglejay.youtu.utils.PreferenceUtil.load(context, PreferenceConstant.SWITCH_DIALOG_PROGRESS_CANCELED_ON_TOUCH_OUTSIDE, true);
    dialog.setCanceledOnTouchOutside(isCanceledOnTouchOutside);
    dialog.setCancelable(isCanceledOnTouchOutside);
}