public java.lang.String name() {
    java.lang.String filename = toFile().getName();
    int separator = filename.indexOf(xyz.enhorse.commons.HandyPath.EXTENSION_SEPARATOR);
    return separator > 0 ? filename.substring(0, separator) : filename;
}