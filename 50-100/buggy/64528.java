private boolean removeWirelessTransmitter(java.lang.String channelName, org.bukkit.Location loc, java.lang.String world) {
    net.licks92.WirelessRedstone.Storage.WirelessChannel channel = getWirelessChannel(channelName);
    if (channel != null) {
        channel.removeTransmitterAt(loc, world);
        return removeWirelessPoint(channelName, loc, world);
    }else
        return false;
    
}