private static boolean inCombinedRootsOrAncestorOfAnyRoot(java.io.File file, java.lang.Iterable<? extends java.io.File> roots, org.gradle.api.internal.file.FileSystemSubset combinedRootsSubset) {
    return (combinedRootsSubset.contains(file)) || (org.gradle.internal.filewatch.jdk7.WatchPointsRegistry.isAncestorOfAnyRoot(file, roots, true));
}