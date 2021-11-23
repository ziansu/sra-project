@java.lang.Override
public void onPaused() {
    messageType = VIDEO_PAUSE;
    isPaused = true;
    messageService.sendMessage(com.gmail.markdevw.wetube.WeTubeApplication.getSharedDataSource().getCurrentRecipient().getId(), "/pause$");
}