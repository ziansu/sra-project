boolean isSubtypeOf(com.google.javascript.jscomp.newtypes.ObjectKind other) {
    return (this.mask) == ((this.mask) & (other.mask));
}