private int getType(java.lang.String settingName) {
    chatty.util.settings.Setting obj = settings.get(settingName);
    if (obj != null) {
        return obj.getType();
    }
    return Setting.UNDEFINED;
}