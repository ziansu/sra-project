@java.lang.Override
public void visitFile(java.nio.file.Path path, java.nio.file.attribute.BasicFileAttributes attrs) {
    size += attrs.size();
    (filesCount)++;
    update();
}