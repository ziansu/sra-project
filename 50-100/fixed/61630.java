public static void writeSignature(java.nio.file.Path signaturePath, java.util.List<ru.fizteh.fivt.students.Oktosha.filemap.SignatureElement> signature) throws java.io.IOException {
    if (signaturePath.toFile().exists()) {
        throw new java.io.IOException("bd already contains signature; can't write");
    }
    try (java.io.FileOutputStream outputStream = new java.io.FileOutputStream(signaturePath.toFile());java.io.PrintWriter writer = new java.io.PrintWriter(outputStream)) {
        ru.fizteh.fivt.students.Oktosha.filemap.DroppableStructuredTableImpl.writeSignature(writer, signature);
    }
}