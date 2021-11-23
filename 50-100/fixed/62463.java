@butterknife.OnCheckedChanged(value = R.id.preload)
public void changePreload(boolean preload) {
    if (((prefs) != null) && (preload != (pasta.streamer.utils.Settings.isPreload(getContext())))) {
        prefs.edit().putBoolean(Settings.PRELOAD, preload).apply();
        onChange();
    }
}