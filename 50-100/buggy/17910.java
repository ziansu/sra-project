@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    android.util.Log.d(com.boostcamp.hyeon.wallpaper.setting.view.SettingFragment.TAG, ("onCheckedChanged: " + isChecked));
    switch (buttonView.getId()) {
        case R.id.sw_wallpaper_type :
            setWallpaperValue(Define.TYPE_USING_WALLPAPER, isChecked);
            break;
        case R.id.sw_random_wallpaper :
            setWallpaperValue(Define.TYPE_USING_RANDOM, isChecked);
            break;
        case R.id.sw_transparent_wallpaper :
            break;
    }
    setSettingValues(false);
}