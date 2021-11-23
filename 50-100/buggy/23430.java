private static com.google.common.hash.HashCode hashJarFile(java.io.File file) {
    org.gradle.api.internal.file.archive.ZipFileTree zipTree = new org.gradle.api.internal.file.archive.ZipFileTree(file, null, null, null);
    final com.google.common.hash.Hasher hasher = org.gradle.api.internal.changedetection.state.JvmClassHasher.createHasher();
    org.gradle.api.internal.file.collections.FileTreeAdapter adapter = new org.gradle.api.internal.file.collections.FileTreeAdapter(zipTree);
    adapter.visit(new org.gradle.api.internal.changedetection.state.JvmClassHasher.HashingJarVisitor(hasher));
    com.google.common.hash.HashCode hash = hasher.hash();
    return hash;
}