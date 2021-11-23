public static boolean addPlayerToChunk(net.minecraft.world.World world, net.minecraft.util.BlockPos pos, net.minecraft.entity.player.EntityPlayer player) {
    if ((pos == null) || (player == null))
        return false;
    
    return alexiil.mods.civ.utils.CraftUtils.addPlayerToChunk(world, pos, alexiil.mods.civ.utils.PlayerTechData.createPlayerTechData(player));
}