@java.lang.Override
protected void onPostExecute(org.csie.mpp.buku.helper.BookUpdater.OnUpdateStatusChangedListener.Status result) {
    if ((listener) != null)
        listener.onUpdateFinish(result);
    
}