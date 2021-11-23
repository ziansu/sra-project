@java.lang.Override
protected void onConnect() {
    java.lang.System.out.println("onConnect");
    ebus.addEvent(new it.biffi.jirc.bot.event.ConnectionEvent());
}