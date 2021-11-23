private void actOnIncoming(java.lang.String key, java.lang.String value) {
    if ((value.length()) == 0) {
        java.lang.String valueToSend = basestation.BaseStation.getInstance().getBotManager().getBotExchange(key);
        tcpConnection.sendKV(key, valueToSend);
    }else {
        basestation.BaseStation.getInstance().getBotManager().setBotExchangeMap(key, value);
    }
}