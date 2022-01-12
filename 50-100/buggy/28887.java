@java.lang.Override
public java.util.Map<java.lang.String, ?> get() {
    java.util.Map<java.lang.String, java.lang.Object> map = new java.util.HashMap<java.lang.String, java.lang.Object>();
    for (ios.foundation.NSString key : nsDictionary.keySet()) {
        ios.NSObject value = nsDictionary.get(key);
        map.put(key.toString(), value.toString());
    }
    return map;
}