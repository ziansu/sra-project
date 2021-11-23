@java.lang.Override
public void onClick(android.view.View view) {
    mContext.startActivity(new android.content.Intent("com.android.settings.POWERMANAGER_SETTINGS").addFlags(((android.content.Intent.FLAG_ACTIVITY_NEW_TASK) | (android.content.Intent.FLAG_ACTIVITY_CLEAR_TASK))));
    this.dismiss();
}