public void startPoller() {
    poller = new client.serverPoller.ServerPoller(game, proxy, 1000);
}