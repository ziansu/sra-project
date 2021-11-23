@java.lang.Override
protected void onHandleIntent(android.content.Intent intent) {
    setStarted(true);
    com.example.jose.updated.controller.NotificationService.pagesToTrack = pagesHolder.getPagesToTrack();
    com.example.jose.updated.controller.NotificationService.updatedPages = pagesHolder.getUpdatedPages();
    createTimerTask();
    setUpTimer(updateTimerTask);
}