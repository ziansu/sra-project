public void parametrize() {
    android.content.SharedPreferences sp = android.preference.PreferenceManager.getDefaultSharedPreferences(getContext());
    boundRipper.loadImages = sp.getBoolean("loadImages", true);
    boundRipper.loadOnCellular = sp.getBoolean("loadOnCellular", true);
    boundRipper.loadVideos = sp.getBoolean("loadVideos", true);
    boundRipper.textIsSelectable = sp.getBoolean("textSelectable", false);
}