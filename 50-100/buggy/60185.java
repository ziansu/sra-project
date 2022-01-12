public void parametrize() {
    android.content.SharedPreferences sp = android.preference.PreferenceManager.getDefaultSharedPreferences(getContext());
    boundRipper.loadImages = sp.getBoolean("loadImages", false);
    boundRipper.loadOnCellular = sp.getBoolean("loadOnCellular", false);
    boundRipper.loadVideos = sp.getBoolean("loadVideos", false);
    boundRipper.textIsSelectable = sp.getBoolean("textSelectable", false);
}