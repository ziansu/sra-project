private void rollbackDocumento(final java.lang.String pathAsString) throws msa.application.exceptions.InternalMsaException {
    try {
        java.nio.file.Path path = java.nio.file.Paths.get(pathAsString);
        java.nio.file.Files.delete(path);
        if (!(java.nio.file.Files.newDirectoryStream(path.getParent()).iterator().hasNext())) {
            java.nio.file.Files.delete(path.getParent());
        }
    } catch (java.lang.Exception e) {
        throw new msa.application.exceptions.InternalMsaException(getErrorMessagesByCodErrore(MessageType.ERROR, "MSA007"));
    }
}