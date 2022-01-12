public boolean isAssignable(final javax.lang.model.type.TypeMirror supplied, final javax.lang.model.type.TypeMirror recipient) {
    com.matthewtamlin.java_utilities.checkers.NullChecker.checkNotNull(supplied, "Argument \'supplied\' cannot be null.");
    com.matthewtamlin.java_utilities.checkers.NullChecker.checkNotNull(recipient, "Argument \'recipient\' cannot be null.");
    final java.util.Set<javax.lang.model.type.TypeMirror> superclasses = getAllSupertypes(supplied);
    final java.util.Set<java.lang.String> superclassNames = com.matthewtamlin.spyglass.processor.util.SetUtil.allToString(superclasses);
    return (superclassNames.contains(recipient.toString())) || (supplied.toString().equals(recipient.toString()));
}