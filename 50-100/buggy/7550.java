@java.lang.Override
public void onServiceConnected(android.content.ComponentName name, android.os.IBinder service) {
    localBinder = ((org.stuartresearch.radio91x.RadioService.LocalBinder) (service));
    bound = true;
    localBinder.getService().songStack.setOnInsertListener(this);
    cardAdapter.setSongInfoStack(localBinder.getService().songStack);
    if (!(localBinder.getService().isPreparing())) {
        progressBar.setIndeterminate(false);
        progressBar.setVisibility(View.GONE);
    }
    onInsert(localBinder.getService().getCurrentSong());
}