@java.lang.Override
public value.Value add(value.Value other) {
    if ((!(isSet())) || (!(other.isSet()))) {
        return new value.IntegerValue();
    }
    return new value.IntegerValue(((value) + (((value.IntegerValue) (other)).getValue())));
}