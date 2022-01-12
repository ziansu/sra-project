public void addUser(com.iskrembilen.quasseldroid.IrcUser user, java.lang.String modes) {
    for (com.iskrembilen.quasseldroid.IrcMode mode : com.iskrembilen.quasseldroid.IrcMode.values()) {
        if (modes.contains(mode.shortModeName)) {
            addUserToModeList(mode, user);
        }
    }
    updateUniqueUsersSortedByMode();
    user.addObserver(this);
    update(null, null);
}