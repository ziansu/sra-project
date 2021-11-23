public void logout() {
    android.util.Log.d(com.tedkim.android.texternalservices.facebook.FacebookManager.TAG, "[Facebook Logout]");
    if ((mOnServicesListener) != null)
        throw new java.lang.NullPointerException("You must setListener");
    
    android.content.Intent intent = new android.content.Intent(mContext, com.tedkim.android.texternalservices.facebook.FacebookActivity.class);
    intent.putExtra(FacebookActivity.ACTION, FacebookActivity.ACTION_LOGOUT);
    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    mContext.startActivity(intent);
}