private void readBufferIntoMap(java.io.BufferedReader bfr) {
    java.lang.String line = "";
    while ((line = bfr.readLine()) != null) {
        if (!(line.equals(""))) {
            java.lang.String[] pair = line.trim().split(":");
            valueMap.put(pair[KEY].trim(), pair[VALUE].trim());
        }
    } 
    return valeuMap;
}