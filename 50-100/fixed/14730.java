public synchronized java.lang.Object[] getRow() {
    try {
        while ((!(endReached)) && ((pendingRow) == null))
            wait();
        
        if ((endReached) && ((pendingRow) == null))
            return null;
        
        java.lang.Object[] row = pendingRow;
        pendingRow = null;
        return row;
    } catch (java.lang.InterruptedException ie) {
        endReached = true;
        return null;
    } finally {
        notifyAll();
    }
}