@java.lang.Override
public java.lang.String toString() {
    if ((first) == null) {
        return "void -> " + (second.toString());
    }
    return ((first.toString()) + " -> ") + (second.toString());
}