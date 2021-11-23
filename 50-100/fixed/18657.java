@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent intent) {
    if (((resultCode == (RESULT_OK)) && (requestCode == (com.google.zxing.client.android.CaptureActivity.HISTORY_REQUEST_CODE))) && ((historyManager) != null)) {
        int itemNumber = intent.getIntExtra(Intents.History.ITEM_NUMBER, (-1));
        if (itemNumber >= 0) {
            com.google.zxing.client.android.history.HistoryItem historyItem = historyManager.buildHistoryItem(itemNumber);
            decodeOrStoreSavedBitmap(null, historyItem.getResult());
        }
    }
}