public boolean logoutUser() {
    editor.clear();
    editor.commit();
    android.content.Intent in = new android.content.Intent(mContext, dev.jinkim.snappollandroid.ui.activity.LoginActivity.class);
    in.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
    in.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    mContext.startActivity(in);
    return true;
}