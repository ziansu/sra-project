@java.lang.Override
public void sendContent(java.io.OutputStream out, org.polymap.service.fs.spi.Range range, java.util.Map<java.lang.String, java.lang.String> params, java.lang.String acceptedContentType) throws java.io.IOException, org.polymap.service.fs.spi.BadRequestException {
    org.polymap.cms.webdav.CmsFile.log.info(("accepted: " + acceptedContentType));
    if ((org.apache.commons.lang3.StringUtils.contains(acceptedContentType, "text/html")) && (org.apache.commons.lang3.StringUtils.endsWithAny(getName().toLowerCase(), org.polymap.cms.webdav.CmsFile.CONTENT_FILE_EXTENSIONS))) {
        sendHtmlForm(out);
    }else {
        super.sendContent(out, range, params, acceptedContentType);
    }
}