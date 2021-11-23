@java.lang.Override
public java.util.Map<java.lang.String, java.lang.Object> merge(java.util.Map<java.lang.String, java.lang.Object> mergeInto, java.util.Map<java.lang.String, java.lang.Object> mergeFrom) {
    java.util.Map<java.lang.String, java.lang.Object> result = new java.util.HashMap<>();
    result.putAll(mergeInto);
    result.putAll(mergeFrom);
    return result;
}