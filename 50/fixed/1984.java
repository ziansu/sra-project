private void saveNewBestTime(long newBestTime) {
    android.content.SharedPreferences.Editor prefEditor = sharedPref.edit();
    prefEditor.putLong("bestTime", newBestTime);
    prefEditor.commit();
}