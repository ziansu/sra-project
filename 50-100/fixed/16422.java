@java.lang.Override
public java.util.Map<java.lang.String, java.lang.Object> serialize() {
    java.util.Map<java.lang.String, java.lang.Object> map = new java.util.HashMap<>();
    map.put("==", getClass().getName());
    map.put("point1", getMinLocation());
    map.put("point2", getMaxLocation());
    if ((data) != null)
        map.put("data", data);
    
    return map;
}