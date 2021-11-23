public synchronized void close() {
    (de.danoeh.antennapod.core.storage.PodDBAdapter.counter)--;
    if ((de.danoeh.antennapod.core.storage.PodDBAdapter.counter) == 0) {
        android.util.Log.v(de.danoeh.antennapod.core.storage.PodDBAdapter.TAG, "Closing DB");
        de.danoeh.antennapod.core.storage.PodDBAdapter.db.close();
        de.danoeh.antennapod.core.storage.PodDBAdapter.db = null;
    }
}