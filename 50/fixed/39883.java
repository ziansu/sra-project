public void resetQcResults() {
    zooActivateWrite();
    if ((qcFilters) == null) {
        qcFilters = new java.util.HashMap<java.lang.String, java.lang.Boolean>();
    }
    qcFilters.clear();
}