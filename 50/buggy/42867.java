public void call() {
    api = new io.rocketchat.core.RocketChatAPI(Main.serverurl);
    api.setReconnectionStrategy(new io.rocketchat.common.network.ReconnectionStrategy(30, 3000));
    api.setPingInterval(3000);
    api.connect(this);
}