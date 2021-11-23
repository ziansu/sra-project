@java.lang.Override
public boolean removeWirelessTransmitter(java.lang.String channelName, org.bukkit.Location loc) {
    net.licks92.WirelessRedstone.Storage.WirelessChannel channel = getWirelessChannel(channelName, true);
    if (channel != null) {
        channel.removeTransmitterAt(loc);
        return removeWirelessPoint(channelName, loc, loc.getWorld().getName());
    }else
        return false;
    
}