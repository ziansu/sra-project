public void suspend() {
    android.util.Log.d("mbta", "Suspending");
    if ((m_db) != null) {
        m_db.close();
        m_db = null;
    }
}