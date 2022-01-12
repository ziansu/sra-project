public int getChannelVolume(int channel) {
    return ru.threedisevenzeror.xmpwrapper.Xmp.checkError(ru.threedisevenzeror.xmpwrapper.Xmp.lib.xmp_channel_vol(context, channel, (-1)));
}