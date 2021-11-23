public void onCheckedSecret() {
    if (!(isChecked)) {
        isChecked = true;
        mStatus = mContext.getString(R.string.professed);
    }
}