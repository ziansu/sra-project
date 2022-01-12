private void removeCity() {
    java.lang.String city = mSelectedTabName;
    if (mDBHelper.removeCity(city)) {
        tabLayout.removeTabAt(mSelectedTabIndex);
        if ((tabLayout.getTabCount()) == 0) {
            mFragmentManager = getFragmentManager();
            mTransaction = mFragmentManager.beginTransaction();
            mTransaction.remove(mWeatherFragment);
            mTransaction.commit();
        }
    }
}