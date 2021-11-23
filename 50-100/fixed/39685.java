private boolean isPlayerCooldownExpired() {
    if (!(cooldownTracker.containsKey(playerName)))
        return true;
    
    final java.lang.String playerName = player.getName().toLowerCase();
    final long cooldown = cooldownTracker.get(playerName);
    if ((cooldown - (java.lang.System.currentTimeMillis())) > 0)
        return false;
    
    cooldownTracker.remove(playerName);
    return true;
}