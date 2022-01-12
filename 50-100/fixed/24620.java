public java.lang.String getTitle() {
    javax.jcr.Node node = null;
    try {
        node = node();
        if (node != null) {
            return org.exoplatform.ecm.webui.utils.Utils.getTitle(node);
        }
    } catch (java.lang.Exception e) {
        org.exoplatform.outlook.social.OutlookAttachmentActivity.LOG.error(("Error reading node name " + node), e);
    }
    return getName();
}