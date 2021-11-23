@java.lang.Override
public void messageSent() {
    if (conversationReady) {
        uiAdapter.doneWaiting();
    }else {
        uiAdapter.waitForProcessing();
    }
}