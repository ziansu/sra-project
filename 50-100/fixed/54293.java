@java.lang.Override
public long getLastModified(javax.servlet.http.HttpServletRequest request) throws java.lang.Exception {
    java.lang.String relativeUrl = opendap.coreServlet.ReqInfo.getLocalUrl(request);
    java.lang.String dataSource = getBesApi().getBesDataSourceID(relativeUrl, false);
    if (dataSource == null) {
        return -1;
    }
    opendap.coreServlet.ResourceInfo ri = getResourceInfo(dataSource);
    return ri.lastModified();
}