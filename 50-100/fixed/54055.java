@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mUser = cz.jacktech.gugorganizer.storage.Settings.getUser();
    if ((mUser) != null) {
        switch (mUser.getGroupType()) {
            case cz.jacktech.gugorganizer.data.User.GROUP_GDG :
                setTheme(R.style.AppTheme_GDG);
                break;
            case cz.jacktech.gugorganizer.data.User.GROUP_GBG :
                setTheme(R.style.AppTheme_GBG);
                break;
            case cz.jacktech.gugorganizer.data.User.GROUP_GXG :
                setTheme(R.style.AppTheme_GXG);
                break;
            case cz.jacktech.gugorganizer.data.User.GROUP_GEG :
                setTheme(R.style.AppTheme_GEG);
                break;
        }
    }
}