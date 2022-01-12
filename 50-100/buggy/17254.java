private static java.util.List<java.lang.String> toStringList(final java.util.Collection<?> arrayValue) {
    final java.util.List<java.lang.String> list = new java.util.ArrayList<java.lang.String>();
    for (final java.lang.Object value : arrayValue) {
        list.add(value.toString());
    }
    return list;
}