private void write(javax.servlet.http.HttpServletResponse resp, org.apache.oltu.oauth2.common.message.OAuthResponse r) throws java.io.IOException {
    resp.setStatus(r.getResponseStatus());
    java.io.PrintWriter pw = resp.getWriter();
    pw.print(r.getBody());
    pw.flush();
    pw.close();
}