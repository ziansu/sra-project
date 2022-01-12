public java.lang.String getActiveChannelListAsString() {
    java.lang.String channelList = "";
    for (org.eclipse.smarthome.core.thing.Channel channel : getThing().getChannels()) {
        if (channel.isLinked()) {
            if ((channelList.length()) > 0)
                channelList = (channelList + ",") + (channel.getUID().getId());
            else
                channelList = channel.getUID().getId();
            
        }
    }
    return channelList;
}