@java.lang.Override
public java.util.Map<java.lang.Object, java.lang.Object> entries() {
    java.util.List<java.lang.Object> values = super.multiGet(whitelistedKeys);
    java.util.Map<java.lang.Object, java.lang.Object> entries = new java.util.HashMap<>();
    for (int i = 0; i < (whitelistedKeys.size()); i++) {
        entries.put(whitelistedKeys.get(i), values.get(i));
    }
    return entries;
}