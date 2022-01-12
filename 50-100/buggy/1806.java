private void loadEverything() {
    android.util.Log.d("lol", "here");
    java.lang.Runnable navigation = navigationMap.get(action);
    if (navigation != null) {
        navigation.run();
    }else {
        navigateLibrary.run();
    }
    new com.naman14.timber.activities.MainActivity.initQuickControls().execute("");
}