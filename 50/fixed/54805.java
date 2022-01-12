public SymbolicValue.ExceptionalSymbolicValue createExceptionalSymbolicValue(@javax.annotation.Nullable
org.sonar.plugins.java.api.semantic.Type exceptionType) {
    return new org.sonar.java.se.symbolicvalues.SymbolicValue.ExceptionalSymbolicValue(nextId(), exceptionType);
}