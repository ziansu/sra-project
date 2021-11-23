public void parseAsKeyValuePairs(java.lang.String item) {
    java.lang.String[] keyValuePairs = item.split("[^a-zA-Z0-9:./]");
    getUniqueItems(keyValuePairs);
}