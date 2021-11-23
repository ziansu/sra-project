public java.lang.String getChannel() {
    if ((channel) == null) {
        this.channel = getProperty("channel");
        this.channel1 = new model.types.Channel(getProperty("channel"));
    }
    return channel;
}