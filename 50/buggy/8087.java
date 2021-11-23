public java.util.Set<java.lang.String> getFavorites() {
    return prefs.getStringSet("list", null);
}