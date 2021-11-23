@java.lang.Override
public java.nio.file.FileVisitResult visitFile(java.nio.file.Path file, java.nio.file.attribute.BasicFileAttributes attrs) throws java.io.IOException {
    final boolean matched = (gp.matchers.isEmpty()) || (gp.matchers.stream().anyMatch((java.nio.file.PathMatcher pm) -> {
        return pm.matches(file);
    }));
    if (matched) {
        return visitor.visitFile(file, attrs);
    }else {
        return java.nio.file.FileVisitResult.SKIP_SUBTREE;
    }
}