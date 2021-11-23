@pt.webdetails.cfr.GET
@pt.webdetails.cfr.Path(value = "/createFolder")
public void createFolder(@javax.ws.rs.core.Context
javax.servlet.http.HttpServletRequest request, @javax.ws.rs.core.Context
javax.servlet.http.HttpServletResponse response) throws java.lang.Exception {
    java.lang.String path = pt.webdetails.cfr.CfrApi.checkRelativePathSanity(getParameter("path", request));
    if ((path == null) || (org.apache.commons.lang.StringUtils.isBlank(path))) {
        throw new java.lang.Exception("path is null or empty");
    }
    boolean createResult = getRepository().createFolder(path);
    writeMessage(new org.json.JSONObject().put("result", createResult).toString(), response.getOutputStream());
}