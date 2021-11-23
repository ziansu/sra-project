public static java.lang.String getBackgroundsDir() {
    java.lang.String path = null;
    if ((path = com.beatsportable.beats.Tools.getBeatsDir()) != null) {
        path += "/samples";
        path += com.beatsportable.beats.Tools.res.getString(R.string.Tools_path_backgrounds);
    }
    return path;
}