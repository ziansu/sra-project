@java.lang.Override
public value.Value mul(value.Value other) {
    if ((!(isSet())) || (!(other.isSet()))) {
        return new value.IntegerValue();
    }
    return new value.IntegerValue(((value) * (((value.IntegerValue) (other)).getValue())));
}