protected void write() {
    if ((mapHardReference) != null) {
        lock.lock();
        try {
            com.sleepycat.je.DatabaseEntry valueEntry = new com.sleepycat.je.DatabaseEntry();
            org.ihtsdo.otf.tcc.datastore.uuidnidmap.UuidToNidSoftMapSegment.uuidIntMapBinder.objectToEntry(mapHardReference, valueEntry);
            com.sleepycat.je.DatabaseEntry theKey = new com.sleepycat.je.DatabaseEntry();
            com.sleepycat.bind.tuple.ByteBinding.byteToEntry(segment, theKey);
            database.put(null, theKey, valueEntry);
            mapHardReference = null;
        } finally {
            lock.unlock();
        }
    }
}