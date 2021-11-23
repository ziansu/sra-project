public void add(org.mapdb.Fun.Tuple2<byte[], java.lang.String> txAndName, java.lang.String key, java.lang.String value) {
    java.util.Map<java.lang.String, java.lang.String> keyValueMap = this.get(txAndName);
    if (keyValueMap == null) {
        keyValueMap = new java.util.HashMap<java.lang.String, java.lang.String>();
    }
    keyValueMap.put(key, value);
    this.set(txAndName, keyValueMap);
}