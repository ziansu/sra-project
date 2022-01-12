public T getPrefixPath(final java.lang.String path) {
    final java.lang.String normalizedPath = io.undertow.util.URLUtils.normalizeSlashes(path);
    io.undertow.util.SubstringMap.SubstringMatch<T> match = paths.get(normalizedPath);
    if ((io.undertow.util.PathMatcher.STRING_PATH_SEPARATOR.equals(normalizedPath)) && (match == null)) {
        return this.defaultHandler;
    }
    if (match == null) {
        return null;
    }
    return match.getValue();
}