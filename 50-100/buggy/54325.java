public void setSettingChanged(java.lang.String settingName) {
    if (isListSetting(settingName)) {
        settingChanged(settingName, Setting.LIST, getList(settingName));
    }else
        if (isMapSetting(settingName)) {
            settingChanged(settingName, Setting.MAP, getMap(settingName));
        }
    
}