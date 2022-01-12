public java.util.List<java.lang.Long> getLongListProperty(java.lang.String aKey) {
    java.util.List<java.lang.Long> result = new java.util.ArrayList<java.lang.Long>();
    java.util.List<?> list = getProperty(aKey, java.util.List.class);
    list.forEach(( item) -> result.add(((java.lang.Long) (item))));
    return result;
}