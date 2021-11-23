private boolean addReceivedMessageToStore(java.lang.String key, java.lang.String value) {
    java.lang.String previousValue = null;
    if ((value.length()) == 0) {
        previousValue = dataCache.remove(key);
    }else {
        previousValue = dataCache.put(key, value);
    }
    return (previousValue == null) || ((previousValue.equals(value)) == false);
}