@java.lang.Deprecated
public java.lang.Class<?> getPropertyType() {
    if ((_accessorMethod) != null) {
        return _accessorMethod.getReturnType();
    }
    if ((_field) != null) {
        return _field.getType();
    }
    return null;
}