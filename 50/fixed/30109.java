@java.lang.Override
public java.lang.String getValueAsString(java.lang.String key, java.lang.String aDefault) {
    return map_.containsKey(key) ? map_.get(key).toString() : aDefault;
}