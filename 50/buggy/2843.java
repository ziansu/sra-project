private java.util.List<java.lang.String> getGooglePermissions() {
    java.util.List<java.lang.String> result = new java.util.ArrayList<>();
    result.add(Scopes.GAMES);
    result.add(Scopes.DRIVE_FILE);
    return result;
}