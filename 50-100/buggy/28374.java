private boolean isOfSubtype(java.lang.String settingName, int type) {
    chatty.util.settings.Setting obj = settings.get(settingName);
    if ((obj != null) && (obj instanceof chatty.util.settings.SubtypeSetting)) {
        return ((chatty.util.settings.SubtypeSetting) (obj)).isOfSubType(type);
    }
    return false;
}