public boolean setCategory(java.lang.String appId, java.lang.String category) {
    if ((apps) == null) {
        throw new java.lang.IllegalStateException("apps must be loaded before setting an app category.");
    }
    if (appId == null) {
        throw new java.lang.NullPointerException("AppId cannot be null.");
    }
    boolean result = false;
    com.slugsource.steamcategories.lib.SteamApp app = apps.get(appId);
    if (app != null) {
        app.setCategory(category);
        categories.add(category);
        result = true;
    }
    return result;
}