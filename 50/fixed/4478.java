public static void exception(org.eclipse.jetty.server.Request request, javax.servlet.http.HttpServletResponse response, int stateCode, java.lang.String content) {
    org.pinae.zazu.server.util.ResponseUtils.output(response, stateCode, "utf-8", "text/plain", null, content);
    request.setHandled(true);
}