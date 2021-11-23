@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    if ((bfv.enemyThread) != null) {
        bfv.enemyThread.paused = true;
        bfv.enemyThread.done = true;
        bfv.enemyThread = null;
        bfv.bm.setRound(((bfv.bm.getRound()) - 1));
    }
    android.widget.Button b = ((android.widget.Button) (findViewById(R.id.start_button)));
    b.setVisibility(android.view.View.VISIBLE);
    android.util.Log.i("Destroy--", "OnDestroy");
    saveFile();
}