private void wakeAllPlayers(net.minecraft.world.WorldServer server) {
    java.util.Iterator iterator = server.playerEntities.iterator();
    while (iterator.hasNext()) {
        net.minecraft.entity.player.EntityPlayerMP p = ((net.minecraft.entity.player.EntityPlayerMP) (iterator.next()));
        de.teamlapen.vampirism.entity.player.VampirePlayer.get(p).wakeUpPlayer(true, false, false, true);
    } 
}