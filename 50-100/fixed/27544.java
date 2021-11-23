@java.lang.Override
public java.util.Map<java.lang.String, java.lang.Object> serialize() {
    java.util.Map<java.lang.String, java.lang.Object> result = new java.util.LinkedHashMap<java.lang.String, java.lang.Object>();
    result.put("active", active);
    result.put("end-time", endTime);
    if ((world) != null)
        result.put("world", world.getUID().toString());
    
    return result;
}