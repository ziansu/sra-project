public void setSettingChanged(java.lang.String settingName) {
    if (isListSetting(settingName)) {
        settingChanged(settingName.toLowerCase(), Setting.LIST, getList(settingName));
    }else
        if (isMapSetting(settingName)) {
            settingChanged(settingName.toLowerCase(), Setting.MAP, getMap(settingName));
        }
    
}