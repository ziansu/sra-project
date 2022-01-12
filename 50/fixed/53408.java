public static void setHudOptions(net.minecraft.entity.player.EntityPlayer playerIn, boolean disableHud, int positionHud, float sizeHud) {
    if ((net.aeronica.mods.mxtune.options.MusicOptionsUtil.MUSIC_OPTIONS) != null)
        playerIn.getCapability(net.aeronica.mods.mxtune.options.MusicOptionsUtil.MUSIC_OPTIONS, null).setHudOptions(playerIn, disableHud, positionHud, sizeHud);
    
}