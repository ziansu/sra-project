public boolean searchClusterID(java.lang.String clusterid) {
    for (java.util.Iterator<lk.filetributed.model.TableEntry> iterator = entries.iterator(); iterator.hasNext();) {
        lk.filetributed.model.TableEntry entry = iterator.next();
        if (entry.getClusterID().equals(clusterid))
            return false;
        
    }
    return true;
}