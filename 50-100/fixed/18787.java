@javax.ws.rs.GET
@javax.ws.rs.Path(value = "getHTMLFileToInject")
public javax.ws.rs.core.Response getHTMLFileToInject(@javax.ws.rs.QueryParam(value = "fileNameNoExt")
java.lang.String fileNameNoExt) {
    java.lang.String folder = test.config.constants.ResourceRelativeFolderPaths.HTML_INJECT;
    java.lang.String path = ((folder + "/") + fileNameNoExt) + ".html";
    java.lang.String sourceText = getFileText(path);
    javax.ws.rs.core.Response op;
    op = utils.JSONUtil.stringToJSONResponse(sourceText, "success!", false);
    return op;
}