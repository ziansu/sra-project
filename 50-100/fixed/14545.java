@java.lang.Override
protected void doGet(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws java.io.IOException, javax.servlet.ServletException {
    java.lang.String challenge = "hub.challenge";
    java.lang.String token = "hub.verify_token";
    java.lang.String value = req.getParameter(challenge);
    java.io.PrintWriter out = resp.getWriter();
    if (token == "abc123")
        out.println(value);
    
    out.flush();
    out.close();
}