@java.lang.Override
public com.emc.documentum.dtos.DocumentumDocument checkoutDocument(java.lang.String documentId) throws com.emc.documentum.exceptions.DocumentCheckoutException, com.emc.documentum.exceptions.RepositoryNotAvailableException {
    com.emc.documentum.dtos.DocumentumDocument document = com.emc.documentum.transformation.DCD2Transformation.convertD2DocItemObject(dcAPI.checkoutDocument(documentId), dcAPI.getContext());
    return document;
}