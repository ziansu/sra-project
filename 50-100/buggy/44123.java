static boolean onTownHallPlaced(@org.jetbrains.annotations.NotNull
final net.minecraft.world.World world, @org.jetbrains.annotations.NotNull
final net.minecraft.entity.player.EntityPlayer player, final net.minecraft.util.math.BlockPos pos) {
    com.minecolonies.coremod.colony.IColony colony = com.minecolonies.coremod.colony.ColonyManager.getIColonyByOwner(world, player);
    if (colony != null) {
        return com.minecolonies.coremod.event.EventHandler.canOwnerPlaceTownHallHere(world, player, colony, pos);
    }
    colony = com.minecolonies.coremod.colony.ColonyManager.getClosestIColony(world, pos);
    if (colony == null) {
        com.minecolonies.coremod.event.EventHandler.createColony(world, player, pos);
        return true;
    }
    return com.minecolonies.coremod.event.EventHandler.canPlayerPlaceTownHallHere(world, player, pos, colony);
}