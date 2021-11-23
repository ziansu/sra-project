public java.lang.String getMap() {
    if (map.contains("http")) {
        if (map.startsWith("http"))
            return info;
        else
            return info.substring(info.indexOf("http"));
        
    }else {
        return "";
    }
}