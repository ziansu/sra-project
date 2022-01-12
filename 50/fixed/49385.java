public void subscribeToChannels(java.lang.String... channels) {
    for (java.lang.String channel : channels) {
        this.channels.add(channel);
        subscribe(channel);
    }
}