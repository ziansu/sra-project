@java.lang.Override
protected void doPost(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws java.io.IOException, javax.servlet.ServletException {
    try {
        allServlets(req, resp);
    } catch (java.security.spec.InvalidKeySpecException | java.security.NoSuchAlgorithmException e) {
        e.printStackTrace();
    }
}