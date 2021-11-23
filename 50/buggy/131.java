public static void setWhiteList(net.minecraft.entity.player.EntityPlayer playerIn, java.util.List<net.aeronica.mods.mxtune.options.PlayerLists> whiteList) {
    if (playerIn != null)
        playerIn.getCapability(net.aeronica.mods.mxtune.options.MusicOptionsUtil.MUSIC_OPTIONS, null).setWhiteList(playerIn, whiteList);
    
}