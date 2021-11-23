@java.lang.Override
protected void handleClick() {
    android.content.Intent intent = new android.content.Intent(android.content.Intent.ACTION_POWERMENU);
    mContext.sendBroadcast(intent);
}