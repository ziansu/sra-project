@java.lang.Override
public server.listener.ResultListener clone() {
    server.listener.ResultListener res = new server.listener.ResultListener(channel, sendTo, listener);
    res.setGame(currGame);
    return res;
}