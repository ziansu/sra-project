public void addCurrentExecuted(java.lang.String key, java.lang.Integer value) {
    if ((totalExecuted.get(key)) == null) {
        currentExecuted.put(key, value);
    }else {
        currentExecuted.put(key, (value - (totalExecuted.get(key))));
    }
}