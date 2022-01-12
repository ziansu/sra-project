public void validateCode(java.lang.String code) {
    if (!(Collection.SYSTEM_COLLECTION.equals(code))) {
        java.lang.String pattern = "[a-zA-Z]([a-zA-Z0-9])+";
        if ((code == null) || (!(code.matches(pattern)))) {
            throw new com.constellio.app.services.collections.CollectionsManagerRuntimeException.CollectionsManagerRuntimeException_InvalidCode(code);
        }
    }
}