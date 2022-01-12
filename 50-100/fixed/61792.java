@java.lang.Override
protected void onPostExecute(com.ichi2.anki.DeckStatus[] status) {
    android.util.Log.d(AnkiDroidApp.TAG, "DeckManager.CloseDeckAsyncTask.onPostExecute()");
    com.ichi2.widget.AnkiDroidWidgetBig.sLoadedDeck = null;
    com.ichi2.widget.AnkiDroidWidgetBig.sCard = null;
    com.ichi2.widget.AnkiDroidWidgetBig.sCurrentMessage = null;
    com.ichi2.widget.AnkiDroidWidgetBig.sWaitForAsyncTask = false;
    com.ichi2.widget.AnkiDroidWidgetBig.sTomorrowDues = status;
    if (com.ichi2.widget.AnkiDroidWidgetBig.sShowProgressDialog) {
        com.ichi2.widget.AnkiDroidWidgetBig.sShowProgressDialog = false;
        com.ichi2.widget.AnkiDroidWidgetBig.updateWidget(com.ichi2.widget.AnkiDroidWidgetBig.UpdateService.VIEW_CONGRATS);
    }
    com.ichi2.widget.AnkiDroidWidgetBig.sShowProgressDialog = false;
}