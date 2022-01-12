public long getTripStartDateOnSharedPreferences() {
    mSharedPreferences = this.getPreferences(Context.MODE_PRIVATE);
    long value_long = mSharedPreferences.getLong(getString(R.string.trip_start_date_tag), 0);
    if (value_long > 0) {
        mSPEditor = mSharedPreferences.edit();
        mSPEditor.remove(this.gameStatus.trip_start_date_tag);
        mSPEditor.commit();
    }
    return value_long;
}