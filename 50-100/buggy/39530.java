@java.lang.Override
public value.BoolValue and(value.Value other) {
    if ((isSet()) || (other.isSet())) {
        return new value.BoolValue();
    }
    return new value.BoolValue(((value) && (((value.BoolValue) (other)).getValue())));
}