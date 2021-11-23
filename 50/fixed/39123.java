@java.lang.Override
public boolean isResolved() {
    return ((this.field) != null) && (this.field.getType().isResolved());
}