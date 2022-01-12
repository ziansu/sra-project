public void write(java.util.List<com.srotya.sidewinder.core.storage.DataPoint> dps) throws java.io.IOException {
    write.lock();
    try {
        for (java.util.Iterator<com.srotya.sidewinder.core.storage.DataPoint> itr = dps.iterator(); itr.hasNext();) {
            com.srotya.sidewinder.core.storage.DataPoint dp = itr.next();
            writeDataPoint(dp.getTimestamp(), dp.getLongValue());
        }
    } finally {
        write.unlock();
    }
}