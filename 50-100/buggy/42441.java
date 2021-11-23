public void setFile(java.lang.String settingName, java.lang.String fileName) {
    if (!(isSetting(settingName))) {
        throw new chatty.util.settings.SettingNotFoundException(("Could not find setting: " + settingName));
    }
    if (!(files.contains(fileName))) {
        throw new chatty.util.settings.SettingFileNotFoundException(("Could not find setting file: " + fileName));
    }
    chatty.util.settings.Setting setting = settings.get(settingName);
    setting.setFile(fileName);
}