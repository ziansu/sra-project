public org.slf4j.Logger getLogger(java.lang.String name) {
    org.slf4j.Logger simpleLogger = loggerMap.get(name);
    if (simpleLogger != null) {
        return simpleLogger;
    }else {
        org.slf4j.Logger newInstance = new org.arivu.log.AsyncLogger(name);
        org.slf4j.Logger oldInstance = loggerMap.putIfAbsent(name, newInstance);
        return oldInstance == null ? newInstance : oldInstance;
    }
}