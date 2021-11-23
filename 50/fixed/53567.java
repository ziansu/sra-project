public static int getMuteOption(net.minecraft.entity.player.EntityPlayer playerIn) {
    return (net.aeronica.mods.mxtune.options.MusicOptionsUtil.MUSIC_OPTIONS) != null ? playerIn.getCapability(net.aeronica.mods.mxtune.options.MusicOptionsUtil.MUSIC_OPTIONS, null).getMuteOption() : net.aeronica.mods.mxtune.options.MusicOptionsUtil.EnumMuteOptions.OFF.getMetadata();
}