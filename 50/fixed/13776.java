public synchronized void setChannels(java.util.List<ch.wellernet.hometv.master.api.model.Channel> channels) {
    this.channels = new java.util.ArrayList<ch.wellernet.hometv.master.api.model.Channel>(channels);
    refresh();
}