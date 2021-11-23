public void put(java.lang.String URL, java.lang.String key, java.lang.String value) {
    if (parseMap.containsKey(URL)) {
        parseMap.get(URL).getMetadata().addValue(key, value);
    }else {
        com.digitalpebble.storm.crawler.parse.ParseData parse = new com.digitalpebble.storm.crawler.parse.ParseData();
        parse.put(key, value);
        parseMap.put(URL, parse);
    }
}