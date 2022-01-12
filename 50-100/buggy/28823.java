static boolean isWrapping(java.util.List<PolygonalNumber> list) {
    java.lang.Long firstPrefix = list.get(0).getPrefix();
    java.lang.Long lastPostfix = list.get(((list.size()) - 1)).getPostfix();
    return firstPrefix.equals(lastPostfix);
}