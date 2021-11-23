public void startPoller() {
    this.poller = new client.serverPoller.ServerPoller(game, proxy, 1000);
}