private java.util.LinkedList<java.lang.String> getRecentFiles() {
    java.lang.String[] keys = new java.lang.String[0];
    keys = props.stringPropertyNames().toArray(keys);
    java.util.Arrays.sort(keys);
    java.util.LinkedList<java.lang.String> recent = new java.util.LinkedList<java.lang.String>();
    for (java.lang.String key : keys) {
        if (key.startsWith("recent["))
            recent.add(props.getProperty(key));
        
    }
    return recent;
}