@java.lang.Override
public boolean handles(java.net.URI location) {
    return java.util.Objects.equals(getScheme(), this.AnonymousScheme);
}