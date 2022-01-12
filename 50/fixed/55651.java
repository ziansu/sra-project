public void setValue(java.lang.String key, java.lang.String value) {
    synchronized(values) {
        if (value == null)
            values.remove(key);
        else
            values.put(key, value);
        
        modifications = true;
    }
}