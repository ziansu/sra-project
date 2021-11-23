private void wakeAllPlayers(net.minecraft.world.WorldServer server) {
    this.allPlayersSleepingCoffin = false;
    java.util.Iterator iterator = server.playerEntities.iterator();
    while (iterator.hasNext()) {
        net.minecraft.entity.player.EntityPlayerMP p = ((net.minecraft.entity.player.EntityPlayerMP) (iterator.next()));
        de.teamlapen.vampirism.entity.player.VampirePlayer.get(p).sleepingCoffin = false;
        de.teamlapen.vampirism.entity.player.VampirePlayer.get(p).sync(true);
        p.wakeUpPlayer(false, false, true);
    } 
}