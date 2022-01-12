private void initializeVideoSync(int requestCode, int deleteCode) {
    android.content.Intent intent = new android.content.Intent(mContext, templar.atakr.sync.VideoSyncIntentService.class);
    intent.putExtra(VideoSyncIntentService.INTENT_REQUEST, requestCode);
    intent.putExtra(VideoSyncIntentService.INTENT_TITLE, "");
    intent.putExtra(VideoSyncIntentService.INTENT_DELETE, deleteCode);
    mContext.startService(intent);
}