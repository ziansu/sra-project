@java.lang.Override
public void transferredResourceDeleted(java.lang.String transferredResourceID) {
    deleteDocumentFromIndex(RodaConstants.INDEX_TRANSFERRED_RESOURCE, transferredResourceID, (("Error deleting Transferred Resource(id=" + transferredResourceID) + ")"));
}