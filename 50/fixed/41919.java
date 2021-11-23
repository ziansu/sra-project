public boolean checkQuester(java.util.UUID uuid) {
    for (java.lang.String s : questerBlacklist) {
        try {
            java.util.UUID.fromString(s);
            return true;
        } catch (java.lang.IllegalArgumentException e) {
        }
    }
    return false;
}