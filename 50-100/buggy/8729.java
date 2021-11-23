@java.lang.Override
public value.Value sub(value.Value other) {
    if ((!(isSet())) || (!(other.isSet()))) {
        return new value.IntegerValue(0);
    }
    return new value.IntegerValue(((value) - (((value.IntegerValue) (other)).getValue())));
}