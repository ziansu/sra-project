public java.lang.String generateFilenameV1X(uk.ac.ucl.excites.sapelli.storage.model.Record record, int attachmentNumber) {
    return generateFilename(record, attachmentNumber, form.isObfuscateMediaFiles());
}