public static boolean isHudDisabled(net.minecraft.entity.player.EntityPlayer playerIn) {
    return playerIn != null ? playerIn.getCapability(net.aeronica.mods.mxtune.options.MusicOptionsUtil.MUSIC_OPTIONS, null).isHudDisabled() : false;
}