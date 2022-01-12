@javax.ws.rs.GET
@javax.ws.rs.Path(value = "/createFolder")
@javax.ws.rs.Produces(value = pt.webdetails.cpf.utils.MimeTypes.JSON)
public java.lang.String createFolder(@javax.ws.rs.QueryParam(value = pt.webdetails.cfr.CfrApi.MethodParams.PATH)
java.lang.String path) throws java.lang.Exception {
    path = pt.webdetails.cfr.CfrApi.checkRelativePathSanity(path);
    if ((path == null) || (org.apache.commons.lang.StringUtils.isBlank(path))) {
        throw new java.lang.Exception("path is null or empty");
    }
    boolean createResult = getRepository().createFolder(path);
    return new org.json.JSONObject().put("result", createResult).toString();
}