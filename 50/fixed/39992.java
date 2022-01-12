@java.lang.Override
public org.alfresco.service.cmr.repository.NodeRef execute() throws java.lang.Throwable {
    testWriteInTransaction(document);
    return document;
}