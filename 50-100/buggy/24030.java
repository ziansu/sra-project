public static final void registerPlayerId(java.lang.String playerName, final java.lang.String playerId) {
    if (playerId.startsWith("-")) {
        return ;
    }
    java.lang.String lowercase = playerName.toLowerCase();
    if (net.sourceforge.kolmafia.session.ContactManager.seenPlayerIds.containsKey(lowercase)) {
        return ;
    }
    net.sourceforge.kolmafia.session.ContactManager.seenPlayerIds.put(lowercase, playerId);
    net.sourceforge.kolmafia.session.ContactManager.seenPlayerNames.put(playerId, playerName);
}