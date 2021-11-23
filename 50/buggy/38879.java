public void preAllocateId(final java.lang.SecurityManager sm, final org.exist.config.ConfigurationDocumentTrigger.PreAllocatedIdReceiver receiver) throws org.exist.EXistException, org.exist.config.PermissionDeniedException {
    switch (this) {
        case ACCOUNT :
            sm.preAllocateAccountId(receiver);
        case GROUP :
            sm.preAllocateGroupId(receiver);
    }
}