@java.lang.Override
public void run() {
    mInterfaceManager.call(MainInterfaceManager.CallMode.FEED_BUTTON_ENABLE);
    mInterfaceManager.call(MainInterfaceManager.CallMode.EVOLUTION_BUTTON_ENABLE);
    mInterfaceManager.call(MainInterfaceManager.CallMode.FEED_COUNT_SET);
    setDebugDescription(Common.DEBUG_DEFAULT);
}