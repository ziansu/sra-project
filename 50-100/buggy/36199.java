private static boolean isNewVersion(android.content.Context context) {
    jahirfiquitiva.iconshowcase.utilities.Preferences mPrefs = new jahirfiquitiva.iconshowcase.utilities.Preferences(context);
    int prevVersionCode = mPrefs.getVersionCode();
    int curVersionCode = jahirfiquitiva.iconshowcase.utilities.utils.Utils.getAppCurrentVersionCode(context);
    if ((curVersionCode > prevVersionCode) && (curVersionCode > (-1))) {
        mPrefs.setVersionCode(curVersionCode);
        return true;
    }
    return false;
}