void save() throws org.jboss.as.controller.OperationFailedException {
    if ((resolvedPath) == null) {
        throw org.wildfly.extension.elytron._private.ElytronSubsystemMessages.ROOT_LOGGER.cantSaveWithoutFile();
    }
    org.wildfly.extension.elytron._private.ElytronSubsystemMessages.ROOT_LOGGER.tracef("saving KeyStore to the file [%s]", resolvedPath);
    try (java.io.FileOutputStream fos = new java.io.FileOutputStream(resolvedPath)) {
        keyStore.store(fos, resolvePassword());
        synched = java.lang.System.currentTimeMillis();
        trackingKeyStore.setModified(false);
    } catch (java.lang.Exception e) {
        throw org.wildfly.extension.elytron._private.ElytronSubsystemMessages.ROOT_LOGGER.unableToCompleteOperation(e, e.getLocalizedMessage());
    }
}