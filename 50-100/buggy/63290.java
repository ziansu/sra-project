public javax.lang.model.element.AnnotationMirror getCombinedSameLen(java.util.List<java.lang.String> a1Names, java.util.List<java.lang.String> a2Names) {
    java.util.HashSet<java.lang.String> newValues = new java.util.HashSet<java.lang.String>(((a1Names.size()) + (a2Names.size())));
    newValues.addAll(a1Names);
    newValues.addAll(a2Names);
    java.lang.String[] names = newValues.toArray(new java.lang.String[newValues.size()]);
    java.util.Arrays.sort(names);
    return createSameLen(names);
}