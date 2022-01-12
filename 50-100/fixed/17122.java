@java.lang.Override
protected void doGet(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws java.io.IOException, javax.servlet.ServletException {
    javax.servlet.ServletOutputStream out = resp.getOutputStream();
    out.write(req.getParameter("age").getBytes());
    out.flush();
    out.close();
}