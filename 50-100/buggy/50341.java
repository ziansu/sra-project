private void add(java.lang.String settingName, java.lang.Object value, int type, int subType, boolean save) {
    if ((type == (Setting.MAP)) || (type == (Setting.LIST))) {
        settings.put(settingName, new chatty.util.settings.SubtypeSetting(value, type, subType, save, defaultFile));
    }else {
        settings.put(settingName, new chatty.util.settings.Setting(value, type, save, defaultFile));
    }
}