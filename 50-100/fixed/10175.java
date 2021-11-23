@java.lang.Override
@javax.annotation.Nullable
protected java.lang.String[] get(org.bukkit.event.Event e) {
    java.lang.String kingdom = null;
    try {
        kingdom = org.kingdoms.manager.game.GameManagement.getPlayerManager().getOfflineKingdomPlayer(p.getSingle(e)).getKingdomName();
    } catch (java.lang.NullPointerException ex) {
        return null;
    }
    return new java.lang.String[]{ kingdom };
}