@java.lang.Override
public boolean putStringList(java.lang.String key, java.util.List<java.lang.String> value) {
    java.lang.String[] array = new java.lang.String[value.size()];
    return putString(key, com.tramsun.libs.prefcompat.Serialize.toString(value.toArray(array)));
}