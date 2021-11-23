private void sendSyncCommand(java.lang.String command, java.lang.Object msgId) {
    if ((_exception) != null) {
        throw _exception;
    }
    if ((_spoutMsg) == null) {
        _spoutMsg = new org.apache.storm.multilang.SpoutMsg();
    }
    _spoutMsg.setCommand("next");
    _spoutMsg.setId("");
    querySubprocess();
}