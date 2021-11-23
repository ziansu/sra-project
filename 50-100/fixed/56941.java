@java.lang.Override
public <T> T deserialize(java.lang.Class<T> type, java.lang.Object obj) throws org.json.serialization.DeserializeException {
    if (obj.getClass().equals(type)) {
        return ((T) (obj));
    }else
        if (org.json.serialization.BaseConverter.checkBaseType(type)) {
            if (JSONObject.NULL.equals(obj))
                return null;
            
            return obj;
        }
    
    return org.json.serialization.JSONConvert.deserialize(type, obj);
}