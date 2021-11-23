@java.lang.Override
protected java.lang.Long load() {
    long count = 0L;
    try {
        count = ((long) (getApi().countAvailableEntries(getCurrentUser())));
    } catch (de.kopis.timeclicker.exceptions.NotAuthenticatedException e) {
        getLOGGER().severe(((("Can not count entries for user " + (getCurrentUser())) + ": ") + (e.getMessage())));
    }
    return count;
}