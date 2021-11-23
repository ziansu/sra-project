public static de.digitalcollections.core.model.api.MimeType fromExtension(java.lang.String ext) {
    final java.lang.String extension;
    if (ext.startsWith(".")) {
        extension = ext.substring(1);
    }else {
        extension = ext;
    }
    return de.digitalcollections.core.model.api.MimeType.knownTypes.values().stream().filter(( m) -> m.getExtensions().contains(extension)).findFirst().orElseGet(() -> null);
}