public java.lang.String getMimeType(javax.jcr.Node node) {
    try {
        return node.getNode("jcr:content").getProperty("jcr:mimeType").getString();
    } catch (javax.jcr.RepositoryException e) {
        org.exoplatform.outlook.social.OutlookAttachmentActivity.LOG.error(("Error getting node mime type " + node), e);
        return org.apache.commons.lang.StringUtils.EMPTY;
    }
}