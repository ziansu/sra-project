public long removeLoadRuntimeEstimate(java.util.Date date) {
    synchronized(loadRuntimeEstimateList) {
        for (java.util.ListIterator<io.druid.server.coordination.MutablePair<java.util.Date, java.lang.Long>> iterator = loadRuntimeEstimateList.listIterator(); iterator.hasNext();) {
            io.druid.server.coordination.MutablePair<java.util.Date, java.lang.Long> item = iterator.next();
            if (item.lhs.equals(date)) {
                loadRuntimeEstimate -= item.rhs;
                iterator.remove();
            }
        }
    }
    return loadRuntimeEstimate;
}