public static float getSizeHud(net.minecraft.entity.player.EntityPlayer playerIn) {
    return (net.aeronica.mods.mxtune.options.MusicOptionsUtil.MUSIC_OPTIONS) != null ? playerIn.getCapability(net.aeronica.mods.mxtune.options.MusicOptionsUtil.MUSIC_OPTIONS, null).getSizeHud() : 0.5F;
}