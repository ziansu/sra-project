public java.lang.String getMap() {
    if (map.contains("http")) {
        if (map.startsWith("http"))
            return map;
        else
            return map.substring(map.indexOf("http"));
        
    }else {
        return "";
    }
}