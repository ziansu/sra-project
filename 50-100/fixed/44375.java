@java.lang.Override
public int getChangeForSpawn(derpatiel.progressivediff.SpawnEventDetails details) {
    java.util.List<net.minecraft.entity.player.EntityPlayer> players = details.entity.getEntityWorld().getEntitiesWithinAABB(net.minecraft.entity.player.EntityPlayer.class, details.entity.getEntityBoundingBox().expand(128, 128, 128));
    if ((players.size()) > 0) {
        return (addedPerExtraPlayer) * ((players.size()) - 1);
    }
    return 0;
}