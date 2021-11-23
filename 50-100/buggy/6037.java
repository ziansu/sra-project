public void checkFirstRun() {
    boolean isFirstRun = getSharedPreferences("PREFERENCE", software.snowball.loworbitircannon.MODE_PRIVATE).getBoolean("isFirstRun", true);
    isFirstRun = true;
    if (isFirstRun) {
        showInputDialog();
        getSharedPreferences("PREFERENCE", software.snowball.loworbitircannon.MODE_PRIVATE).edit().putBoolean("isFirstRun", false).apply();
    }
}