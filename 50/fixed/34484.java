@java.lang.Override
public boolean putFloatList(java.lang.String key, java.util.List<java.lang.Float> value) {
    java.lang.Float[] array = new java.lang.Float[value.size()];
    return putString(key, com.tramsun.libs.prefcompat.Serialize.toString(value.toArray(array)));
}