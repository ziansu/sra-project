@java.lang.Override
public value.BoolValue eq(value.Value other) {
    if ((!(isSet())) || (!(other.isSet()))) {
        return new value.BoolValue();
    }
    java.lang.System.out.println("TODO Does this work?");
    return new value.BoolValue(((value) == (((value.BoolValue) (other)).getValue())));
}