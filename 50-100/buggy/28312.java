@java.lang.Override
public void onContentPropertyUpdate(org.alfresco.service.cmr.repository.NodeRef nodeRef, org.alfresco.service.namespace.QName propertyQName, org.alfresco.service.cmr.repository.ContentData beforeValue, org.alfresco.service.cmr.repository.ContentData afterValue) {
    long oldSize = (beforeValue != null) ? beforeValue.getSize() : 0;
    long newSize = (afterValue != null) ? afterValue.getSize() : 0;
    org.alfresco.service.cmr.repository.NodeRef siteRef = getUtils().getSiteRefByNode(nodeRef);
    if (siteRef != null) {
        getSizeUpdFactory().setSiteSize(siteRef, (newSize - oldSize), true);
    }
}