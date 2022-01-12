private void write(javax.servlet.http.HttpServletResponse resp, org.apache.oltu.oauth2.common.message.OAuthResponse response) throws java.io.IOException {
    resp.setStatus(response.getResponseStatus());
    java.io.PrintWriter pw = resp.getWriter();
    pw.print(response.getBody());
    pw.flush();
    pw.close();
}