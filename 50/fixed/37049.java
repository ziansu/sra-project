private void readMyList() {
    mMyList = new java.util.HashSet(mSharedPreferences.getStringSet(mContext.getString(R.string.MY_LIST_IDS), new java.util.HashSet<java.lang.String>()));
}