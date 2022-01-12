private void sendUpdateToPlayer(java.util.List<animated.spferical.netrogue.networking.Diff> diffs, com.esotericsoftware.kryonet.Connection player) {
    animated.spferical.netrogue.world.Player p = ((animated.spferical.netrogue.world.Player) (this.gameState.getChild(this.playerIDs.get(player))));
    for (animated.spferical.netrogue.networking.Diff diff : diffs)
        diff.connectionID = player.getID();
    
    if (!(diffs.isEmpty()))
        this.server.sendToTCP(player.getID(), diffs);
    
}