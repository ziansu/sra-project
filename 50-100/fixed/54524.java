public void addModeToUser(com.iskrembilen.quasseldroid.IrcUser user, java.lang.String mode) {
    for (com.iskrembilen.quasseldroid.IrcMode ircMode : com.iskrembilen.quasseldroid.IrcMode.values()) {
        if (mode.equals(ircMode.shortModeName)) {
            if (addUserToModeList(ircMode, user)) {
                break;
            }else {
            }
        }
    }
    updateUniqueUsersSortedByMode();
    update(null, null);
}