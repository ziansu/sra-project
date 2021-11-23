private oakbot.command.javadoc.ClassName toClassName(java.nio.file.Path file) {
    java.lang.String fullPath = file.toString();
    java.lang.String fullName = fullPath.substring(1, ((fullPath.length()) - (oakbot.command.javadoc.JavadocZipFile.extension.length())));
    if (!(fullName.contains("."))) {
        fullName = fullName.replace('/', '.');
    }
    return new oakbot.command.javadoc.ClassName(fullName);
}