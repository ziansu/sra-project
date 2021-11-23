private void actOnIncoming(java.lang.String key, java.lang.String value) {
    if ((value.length()) == 0) {
        java.lang.String valueToSend = basestation.BaseStation.getInstance().getBotManager().getBotExchange(key);
        java.lang.System.out.println(("valueToSend: " + valueToSend));
        tcpConnection.sendKV(key, valueToSend);
    }else {
        java.lang.System.out.println(((("key: " + key) + ", value: ") + value));
        basestation.BaseStation.getInstance().getBotManager().setBotExchangeMap(key, value);
    }
}