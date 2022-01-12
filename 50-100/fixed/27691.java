@java.lang.Override
protected void onNewIntent(android.content.Intent intent) {
    super.onNewIntent(intent);
    android.util.Log.v(fr.perso.poneydolist.ItemsActivity.LOG_TAG, ((("On new intent: " + (intent.getIntExtra(SyncService.INTENT_EXTRA_LIST_ID, (-1)))) + " ") + (intent.getStringExtra(SyncService.INTENT_EXTRA_LIST_TITLE))));
    setIntent(intent);
}