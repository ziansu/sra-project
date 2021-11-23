public java.lang.String getListType() {
    if ((this.listType) == null) {
        this.listType = com.ozpathway.sw.erms.webapp.utils.FacesUtils.getRequestParameter("type");
    }
    return this.listType;
}