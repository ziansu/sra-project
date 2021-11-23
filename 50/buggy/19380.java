public void logoutUser() {
    editor.clear();
    editor.commit();
    android.content.Intent intent = new android.content.Intent(mContext, com.shannor.theloyaltynetwork.activities.LoginActivity.class);
    mContext.startActivity(intent);
}