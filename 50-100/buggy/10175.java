@java.lang.Override
@javax.annotation.Nullable
protected java.lang.String[] get(org.bukkit.event.Event e) {
    java.lang.String kingdom = org.kingdoms.manager.game.GameManagement.getPlayerManager().getOfflineKingdomPlayer(p.getSingle(e)).getKingdomName();
    try {
    } catch (java.lang.NullPointerException ex) {
        return new java.lang.String[]{  };
    }
    return new java.lang.String[]{ kingdom };
}