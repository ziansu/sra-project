@java.lang.Deprecated
public java.lang.Class<?> getPropertyType() {
    return (_accessorMethod) != null ? _accessorMethod.getReturnType() : _field.getType();
}