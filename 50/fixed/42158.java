@java.lang.Override
protected void onIncomingFileTransfer(org.jibble.pircbot.DccFileTransfer transfer) {
    it.biffi.jirc.bot.event.FileTransferStartEvent event = new it.biffi.jirc.bot.event.FileTransferStartEvent();
    ebus.addEvent(event, transfer);
    super.onIncomingFileTransfer(transfer);
}