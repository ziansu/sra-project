public java.lang.String getTitle(javax.jcr.Node node) {
    try {
        return org.exoplatform.ecm.webui.utils.Utils.getTitle(node);
    } catch (java.lang.Exception e) {
        try {
            return node.getName();
        } catch (javax.jcr.RepositoryException e1) {
            org.exoplatform.outlook.social.OutlookAttachmentActivity.LOG.error(("Error reading node name " + node), e);
            return org.apache.commons.lang.StringUtils.EMPTY;
        }
    }
}