@java.lang.Override
public java.lang.String toString() {
    if ((first) == null) {
        return "void -> " + (second.id);
    }
    return ((first.id) + " -> ") + (second.id);
}