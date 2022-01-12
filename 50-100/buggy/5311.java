@java.lang.Override
public value.BoolValue or(value.Value other) {
    if ((isSet()) || (other.isSet())) {
        return new value.BoolValue();
    }
    return new value.BoolValue(((value) || (((value.BoolValue) (other)).getValue())));
}