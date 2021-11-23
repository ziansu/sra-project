public static de.digitalcollections.core.model.api.MimeType fromURI(java.net.URI uri) {
    try {
        return de.digitalcollections.core.model.api.MimeType.fromFilename(java.nio.file.Paths.get(uri).toString());
    } catch (java.nio.file.FileSystemNotFoundException e) {
        return de.digitalcollections.core.model.api.MimeType.fromExtension(org.apache.commons.io.FilenameUtils.getExtension(uri.toString().toLowerCase()));
    }
}