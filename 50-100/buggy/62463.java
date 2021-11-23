@butterknife.OnCheckedChanged(value = R.id.preload)
public void changePreload(boolean preload) {
    if ((prefs) == null)
        return ;
    
    if (preload != (pasta.streamer.utils.Settings.isPreload(getContext())))
        onChange();
    
    prefs.edit().putBoolean(Settings.PRELOAD, preload).apply();
}