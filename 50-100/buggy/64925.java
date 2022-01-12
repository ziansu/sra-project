public void log(java.lang.String type, java.lang.String message, java.util.Date logDate) {
    org.javarosa.core.log.LogEntry log = new org.javarosa.core.log.LogEntry(type, message, logDate);
    try {
        logStorage.add(log);
    } catch (org.javarosa.core.services.storage.StorageFullException e) {
        throw new java.lang.RuntimeException("uh-oh, storage full [incidentlog]");
    }
}