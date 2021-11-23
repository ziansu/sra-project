public void addUsers(java.util.ArrayList<android.util.Pair<com.iskrembilen.quasseldroid.IrcUser, java.lang.String>> usersWithModes) {
    for (android.util.Pair<com.iskrembilen.quasseldroid.IrcUser, java.lang.String> user : usersWithModes) {
        for (com.iskrembilen.quasseldroid.IrcMode mode : com.iskrembilen.quasseldroid.IrcMode.values()) {
            if (user.second.contains(mode.shortModeName)) {
                if (addUserToModeList(mode, user.first)) {
                }else {
                }
            }
        }
        user.first.addObserver(this);
    }
    updateUniqueUsersSortedByMode();
    update(null, null);
}