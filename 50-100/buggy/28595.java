private static boolean isBackpackValid(net.minecraft.entity.player.EntityPlayer player, gr8pefish.ironbackpacks.entity.EntityBackpack backpack) {
    if ((((player == null) || (player.isDead)) || (backpack == null)) || (backpack.isDead))
        return false;
    
    if ((player.worldObj.provider.getDimension()) != (backpack.worldObj.provider.getDimension()))
        return false;
    
    return true;
}