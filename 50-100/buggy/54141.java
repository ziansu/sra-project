public static kr.jihee.text_toolkit.lang.JMap from(java.util.Map<java.lang.String, ?> map, java.util.Collection<java.lang.String> keys) {
    kr.jihee.text_toolkit.lang.JMap map2 = new kr.jihee.text_toolkit.lang.JMap();
    for (java.lang.String key : keys)
        map2.append(key, map.get(key));
    
    return map2;
}