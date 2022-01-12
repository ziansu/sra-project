@java.lang.Override
protected java.lang.Void doInBackground(com.cawlfield.topher.servicemusicplayer.PlayListItemBase... pli) {
    this.pli = pli[0];
    do {
        publishProgress();
        try {
            java.lang.Thread.sleep(500);
        } catch (java.lang.InterruptedException e) {
        }
    } while (!(isCancelled()) );
    return null;
}