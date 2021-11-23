public void addEntryListener(com.joy.http.volley.RetroCache.OnEntryListener lisn) {
    if ((mOnEntryLisns) == null) {
        mOnEntryLisns = new java.util.Vector<>();
    }
    mOnEntryLisns.add(lisn);
}