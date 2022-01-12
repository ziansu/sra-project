public com.oasisfeng.hack.Hack.HackedTargetField<T> ofType(final java.lang.String type_name) {
    try {
        @java.lang.SuppressWarnings(value = "unchecked")
        final com.oasisfeng.hack.Hack.HackedTargetField<T> casted = ((com.oasisfeng.hack.Hack.HackedTargetField<T>) (ofType(java.lang.Class.forName(type_name, false, mField.getDeclaringClass().getClassLoader()))));
        return casted;
    } catch (final java.lang.ClassNotFoundException e) {
        com.oasisfeng.hack.Hack.fail(new com.oasisfeng.hack.Hack.AssertionException(e));
        return this;
    }
}