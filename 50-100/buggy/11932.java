public void append(java.lang.String key, java.lang.String content) {
    java.lang.String value = get(key);
    if (value == null) {
        put(key, content);
    }else {
        value = value + content;
    }
    logger.info(((((("Node[" + (node.getHashcode())) + "] APPEND Key:") + key) + "Value:") + value));
}