protected java.lang.String getPath(java.nio.file.Path dir) {
    return stack.peek().getChildPath(dir.getFileName().toString());
}