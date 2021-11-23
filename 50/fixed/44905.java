public void put(java.util.Properties properties) {
    if ((value) == null)
        properties.remove(name);
    else
        properties.put(name, value.toString());
    
}