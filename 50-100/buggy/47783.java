private java.io.File[] findChildrenExcept(final java.io.File dir, final java.util.regex.Pattern pattern, final java.io.File exception) {
    final java.lang.String exceptionName = (exception == null) ? null : exception.getName();
    return dir.listFiles(( dir1, name) -> (!(name.equals(exceptionName))) && (pattern.matcher(name).matches()));
}