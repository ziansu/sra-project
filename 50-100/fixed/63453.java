protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    super.doPost(request, response);
    java.lang.String detail = request.getParameter("tet");
    com.tusheng.oa.Checko co = new com.tusheng.oa.Checko();
    int gl = this.user.getId();
    co.check(detail, gl);
    java.lang.System.out.println(gl);
    response.sendRedirect(((request.getContextPath()) + "/worktwo/"));
}