@java.lang.SuppressWarnings(value = "unused")
@com.facebook.react.bridge.ReactMethod
public void addTag(java.lang.String tag, com.facebook.react.bridge.ReadableMap properties) {
    java.util.HashMap<java.lang.String, java.lang.String> map = new java.util.HashMap<java.lang.String, java.lang.String>();
    com.facebook.react.bridge.ReadableMapKeySetIterator iterator = properties.keySetIterator();
    while (iterator.hasNextKey()) {
        java.lang.String key = iterator.nextKey();
        java.lang.Object value = properties.getObject(key);
        map.put(key, value);
    } 
    com.uxcam.UXCam.addTagWithProperties(tag, map);
}