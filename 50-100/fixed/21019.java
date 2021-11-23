@java.lang.Override
public void handle(net.md_5.bungee.protocol.packet.KeepAlive alive) throws java.lang.Exception {
    if ((alive.getRandomId()) == (con.getServer().getSentPingId())) {
        int newPing = ((int) ((java.lang.System.currentTimeMillis()) - (con.getSentPingTime())));
        con.getTabListHandler().onPingChange(newPing);
        con.setPing(newPing);
    }
    throw CancelSendSignal.INSTANCE;
}