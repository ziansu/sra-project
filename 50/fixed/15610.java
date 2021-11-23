final java.util.Date getLastUpdate() {
    synchronized(monitor) {
        return lastUpdate;
    }
}