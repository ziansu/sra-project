public boolean isText() {
    java.lang.String contentType = this.contentType();
    return org.apache.commons.lang3.StringUtils.isBlank(contentType) ? false : (((jcrawler.Response.P_TEXT.matcher(contentType).matches()) || (isHtml())) || (isXml())) || (isJson());
}