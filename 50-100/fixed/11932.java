public void append(java.lang.String key, java.lang.String content) {
    java.lang.String value = get(key);
    if (value != null) {
        value += content;
    }
    put(key, value);
    logger.info(((((("Node[" + (node.getHashcode())) + "] APPEND Key:") + key) + "Value:") + value));
}