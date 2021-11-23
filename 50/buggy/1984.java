private void saveNewBestTime(long newBestTime) {
    android.content.SharedPreferences sharedPref = getSharedPreferences("Runner", com.runrmby.runner.MODE_PRIVATE);
    android.content.SharedPreferences.Editor prefEditor = sharedPref.edit();
    prefEditor.putLong("bestTime", newBestTime);
    prefEditor.commit();
}