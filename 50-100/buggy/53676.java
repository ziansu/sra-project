private static java.lang.String userNameValidation(java.lang.String userName) {
    if (((userName == null) || (!(userName.matches("[0-9a-zA-Z_-]+")))) || ((userName.length()) <= 2)) {
        return "Usernames must be at least 3 characters long and can only contain alpha numeric characters, -, and _";
    }
    if (userName.contains(InGameLobbyWatcher.LOBBY_WATCHER_NAME)) {
        return (games.strategy.engine.framework.startup.ui.InGameLobbyWatcher.LOBBY_WATCHER_NAME) + " cannot be part of a name";
    }
    if (userName.toLowerCase().contains("admin")) {
        return "Username can't contain the word admin";
    }
    return null;
}