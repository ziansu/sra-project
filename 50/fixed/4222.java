public boolean addChannelBundle(net.java.sip.communicator.impl.protocol.jabber.extensions.colibri.ColibriConferenceIQ.ChannelBundle channelBundle) {
    if (channelBundle == null)
        throw new java.lang.NullPointerException("channelBundle");
    
    return channelBundles.contains(channelBundle) ? false : channelBundles.add(channelBundle);
}