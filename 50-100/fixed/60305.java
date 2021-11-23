public java.lang.String checkDefaultDocumentCollection(com.bagri.core.model.Document doc) {
    java.util.Collection cln = getTypedCollection(repo.getSchema(), doc.getTypeRoot());
    logger.trace("checkDefaultDocumentCollection; got collection: {} for typePath: {}", cln, doc.getTypeRoot());
    if (cln != null) {
        doc.addCollection(cln.getId());
        return cln.getName();
    }
    return null;
}