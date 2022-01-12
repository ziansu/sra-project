private void guardarWallpaper(java.lang.String wallpaper) {
    if ((wallpaper.length()) > 0) {
        sharedPreferences = getSharedPreferences(getString(R.string.prefs), getApplicationContext().MODE_PRIVATE);
        sharedPreferences.edit().putString(getString(R.string.wallpaper), wallpaper).commit();
    }
}