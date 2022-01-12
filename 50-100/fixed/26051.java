private void closeAllChannels() {
    for (java.lang.Object o : mChannelControllerList.entrySet()) {
        java.util.Map.Entry pair = ((java.util.Map.Entry) (o));
        org.md2k.autosense.antradio.connection.ChannelController channel = ((org.md2k.autosense.antradio.connection.ChannelController) (pair.getValue()));
        channel.close();
    }
    mChannelControllerList.clear();
}