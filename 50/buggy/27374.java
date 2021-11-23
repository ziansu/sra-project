@java.lang.Override
public void onPrevious() {
    if ((playlistIndex) > 0) {
        (playlistIndex)--;
        messageService.sendMessage(com.gmail.markdevw.wetube.WeTubeApplication.getSharedDataSource().getCurrentRecipient().getId(), "playlistprev");
    }
}