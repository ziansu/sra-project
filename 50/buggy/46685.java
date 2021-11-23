public static void setMuteOption(net.minecraft.entity.player.EntityPlayer playerIn, int muteOptionIn) {
    if (playerIn != null)
        playerIn.getCapability(net.aeronica.mods.mxtune.options.MusicOptionsUtil.MUSIC_OPTIONS, null).setMuteOption(playerIn, muteOptionIn);
    
}