@java.lang.Override
protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    java.lang.String name = request.getParameter("name");
    java.lang.System.out.println(("Name: " + name));
    response.setCharacterEncoding("UTF-8");
    response.getWriter().append(("Your name: " + name));
}