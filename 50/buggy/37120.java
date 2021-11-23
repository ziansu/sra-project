@java.lang.Override
public boolean hasReference(@org.jetbrains.annotations.NotNull
java.lang.String objectReference) {
    return (objectReference.isEmpty()) || (objectAttributes.containsKey(objectReference));
}