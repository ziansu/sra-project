@java.lang.Override
public boolean putIntList(java.lang.String key, java.util.List<java.lang.Integer> value) {
    return putString(key, com.tramsun.libs.prefcompat.Serialize.toString(value.toArray()));
}