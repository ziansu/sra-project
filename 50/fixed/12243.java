@java.lang.Override
public java.lang.String toString() {
    return earlySets.stream().map(java.lang.Object::toString).collect(java.util.stream.Collectors.joining("\n", "\n", "\n"));
}