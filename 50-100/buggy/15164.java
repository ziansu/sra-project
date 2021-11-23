@java.lang.Override
public java.lang.Boolean apply(final com.intellij.openapi.roots.SourceFolder it) {
    boolean _and = false;
    boolean _isTestSource = it.isTestSource();
    boolean _not = !_isTestSource;
    if (!_not) {
        _and = false;
    }else {
        com.intellij.openapi.vfs.VirtualFile _file = it.getFile();
        boolean _exists = _file.exists();
        _and = _exists;
    }
    return java.lang.Boolean.valueOf(_and);
}