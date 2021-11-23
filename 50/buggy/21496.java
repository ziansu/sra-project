public void onCheckedSecret() {
    if (isChecked) {
        isChecked = false;
        mStatus = mContext.getString(R.string.secret);
    }else {
        isChecked = true;
        mStatus = mContext.getString(R.string.professed);
    }
}