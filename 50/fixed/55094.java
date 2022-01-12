public static java.util.ArrayList<java.lang.String> loadPlayer(java.lang.String name, java.lang.String password) {
    try {
        return saving.PlayerSaver.loadPlayer(name.toLowerCase(), password);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return null;
}