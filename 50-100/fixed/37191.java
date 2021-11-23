public void addNumberToBlacklist(java.lang.String number) {
    if (com.android.internal.telephony.util.BlacklistUtils.addOrUpdate(mContext, number, BlacklistUtils.BLOCK_CALLS, BlacklistUtils.BLOCK_CALLS)) {
        java.lang.String message = mContext.getString(R.string.toast_added_to_blacklist, number);
        android.widget.Toast.makeText(mContext, message, Toast.LENGTH_SHORT).show();
    }
}