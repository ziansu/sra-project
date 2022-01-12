private java.lang.Object get(java.lang.String settingName, int type) {
    synchronized(LOCK) {
        if (!(isOfType(settingName, type))) {
            throw new chatty.util.settings.SettingNotFoundException(("Could not find setting: " + settingName));
        }
        return settings.get(settingName).getValue();
    }
}