@java.lang.Override
protected java.lang.Void doInBackground(com.cawlfield.topher.servicemusicplayer.PlayListItemBase... pli) {
    do {
        publishProgress(pli[0].getProgress());
        try {
            java.lang.Thread.sleep(500);
        } catch (java.lang.InterruptedException e) {
        }
    } while (!(isCancelled()) );
    return null;
}