public void removeModeFromUser(com.iskrembilen.quasseldroid.IrcUser user, java.lang.String mode) {
    if (mode.equals("")) {
        return ;
    }
    for (com.iskrembilen.quasseldroid.IrcMode ircMode : com.iskrembilen.quasseldroid.IrcMode.values()) {
        if (mode.equals(ircMode.shortModeName)) {
            if (removeUserFromModeList(ircMode, user)) {
                break;
            }else {
            }
        }
    }
    updateUniqueUsersSortedByMode();
    update(null, null);
}