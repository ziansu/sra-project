public void setChannels(java.util.List<org.apache.flume.Channel> channels) {
    super.setChannels(channels);
    this.size = channels.size();
    this.channels = new java.util.ArrayList<java.util.ArrayList<org.apache.flume.Channel>>(size);
    for (org.apache.flume.Channel c : channels) {
        java.util.ArrayList<org.apache.flume.Channel> channelArray = new java.util.ArrayList<org.apache.flume.Channel>(1);
        channelArray.add(c);
        this.channels.add(channelArray);
    }
}