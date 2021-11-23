public static org.apache.commons.vfs2.FileSelector and(java.lang.Iterable<org.apache.commons.vfs2.FileSelector> selectors) {
    return new org.metaborg.util.resource.AndFileSelector(org.metaborg.util.iterators.Iterables2.from(selectors));
}