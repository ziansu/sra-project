@java.lang.Override
public T fromString(java.lang.String value) {
    if (value == null) {
        return rawType.cast(java.util.OptionalInt.empty());
    }
    return rawType.cast(java.util.OptionalInt.of(java.lang.Integer.valueOf(value)));
}