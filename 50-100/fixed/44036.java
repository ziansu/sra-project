@java.lang.Override
public void onSetNodeType(org.alfresco.service.cmr.repository.NodeRef nodeRef, org.alfresco.service.namespace.QName oldType, org.alfresco.service.namespace.QName newType) {
    boolean isNewContent = !(org.alfresco.museum.ucm.sizelimits.SiteSizeLimitsBean.TYPES_TO_CHECK.contains(oldType));
    if (isNewContent) {
        org.alfresco.service.cmr.repository.NodeRef siteRef = getUtils().getSiteRefByNode(nodeRef);
        long size = getUtils().getNodeSize(nodeRef);
        getSizeUpdFactory().setSiteSize(siteRef, size, true, false);
    }
}