@java.lang.Override
public java.util.UUID[] findGames() {
    java.util.Set<java.util.UUID> keys = new java.util.HashSet<java.util.UUID>(games.keySet());
    keys.removeIf(( k) -> {
        lolsoap.GameInstance game = games.get(k);
        return game.isGameStarted();
    });
    return keys.toArray(new java.util.UUID[0]);
}