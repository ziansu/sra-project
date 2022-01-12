public void initializeVideoSync(int requestCode, int deleteCode, java.lang.String title) {
    android.content.Intent intent = new android.content.Intent(this, templar.atakr.sync.VideoSyncIntentService.class);
    intent.putExtra(VideoSyncIntentService.INTENT_REQUEST, requestCode);
    intent.putExtra(VideoSyncIntentService.INTENT_DELETE, deleteCode);
    if ((title == null) || (title.isEmpty())) {
        intent.putExtra(VideoSyncIntentService.INTENT_TITLE, "");
    }else {
        intent.putExtra(VideoSyncIntentService.INTENT_TITLE, title);
    }
    startService(intent);
}