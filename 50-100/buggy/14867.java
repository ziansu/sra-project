public boolean[] loadSettings() {
    android.content.SharedPreferences sharedPreferences = getPreferences(com.example.hjk.testing.MODE_PRIVATE);
    boolean[] isCheck = new boolean[30];
    isCheck[0] = sharedPreferences.getBoolean("sound", false);
    isCheck[1] = sharedPreferences.getBoolean("vibration", false);
    return isCheck;
}