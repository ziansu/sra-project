@java.lang.Override
public value.BoolValue notEq(value.Value other) {
    if ((isSet()) || (other.isSet())) {
        return new value.BoolValue();
    }
    java.lang.System.out.println("TODO does this work?");
    return new value.BoolValue((!(this.equals(other))));
}