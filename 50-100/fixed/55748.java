@java.lang.Override
public void download(java.util.UUID id, java.io.OutputStream out) {
    final java.io.File requestedFile = getFile(id);
    try {
        com.google.common.io.Files.copy(requestedFile, () -> out);
    } catch (java.io.IOException e) {
        throw new com.b2international.snowowl.core.api.SnowowlRuntimeException(("Failed to download attachment of " + id), e);
    }
}