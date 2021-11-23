static com.opentext.ia.sdk.sip.DigitalObject fromFile(java.lang.String referenceInformation, java.io.File file) {
    return com.opentext.ia.sdk.sip.DigitalObject.fromSupplier(referenceInformation, file::length, () -> {
        try {
            return new java.io.FileInputStream(file);
        } catch (java.io.FileNotFoundException e) {
            throw new com.opentext.ia.sdk.support.io.RuntimeIoException(e);
        }
    });
}