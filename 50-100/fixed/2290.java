private static void collectPublicFieldsInto(java.util.List<com.sun.javadoc.FieldDoc> buffer, com.sun.javadoc.ClassDoc toScan) {
    buffer.addAll(java.util.Arrays.asList(toScan.fields()).stream().filter(com.sporniket.libre.javabeans.core.pojo.encapsulator.FieldDocUtils.IS_ACCESSIBLE_FIELD).collect(java.util.stream.Collectors.toList()));
    if (!(java.lang.Object.class.getName().equals(toScan.qualifiedName()))) {
        com.sporniket.libre.javabeans.core.pojo.encapsulator.FieldDocUtils.collectPublicFieldsInto(buffer, toScan.superclass());
    }
}