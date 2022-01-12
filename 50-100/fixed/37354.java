public synchronized boolean saveEntry(com.sistemasoperativos.denny.rssreader.models.Entry entry) {
    try {
        while ((available) == true) {
            wait();
        } 
        entryDao.createOrUpdate(entry);
        available = true;
        notifyAll();
        return true;
    } catch (java.lang.InterruptedException e) {
    } catch (java.sql.SQLException e) {
        android.util.Log.d(com.sistemasoperativos.denny.rssreader.database.db.EntryDB.TAG, ("ERROR: Could not save Entry: " + entry));
        e.printStackTrace();
    }
    return false;
}