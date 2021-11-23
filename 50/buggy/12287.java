@java.lang.Override
protected void onFileTransferFinished(org.jibble.pircbot.DccFileTransfer transfer, java.lang.Exception e) {
    java.lang.System.out.println("<<<<<<onFileTransferFinished>>>>>>");
    it.biffi.jirc.bot.event.FileTrasnferFinishEvent event = new it.biffi.jirc.bot.event.FileTrasnferFinishEvent();
    ebus.addEvent(event, e);
    super.onFileTransferFinished(transfer, e);
}