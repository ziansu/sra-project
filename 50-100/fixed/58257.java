private void savePath(java.lang.String path) {
    java.util.Set<java.lang.String> stringSet = new java.util.HashSet<>();
    stringSet.addAll(sharedPreferences.getStringSet("paths", new java.util.HashSet<java.lang.String>() {
        {
            add(dk.aau.sw802f15.tempoplayer.Settings.SettingsFragment.DEFAULT_DIRECTORY);
        }
    }));
    stringSet.add(path);
    android.content.SharedPreferences.Editor editor = sharedPreferences.edit();
    editor.putStringSet("paths", stringSet);
    editor.apply();
}