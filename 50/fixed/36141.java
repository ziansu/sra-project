@java.lang.Override
public boolean accept(java.io.File pathname) {
    return ((pathname != null) && (pathname.canRead())) && (!(pathname.isHidden()));
}