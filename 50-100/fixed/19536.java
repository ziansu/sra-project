@java.lang.Override
protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    response.setContentType("text/html");
    response.getWriter().print("Hello Walters GitWorld!");
    response.getWriter().print("<br/>second line");
    response.getWriter().print("<br/> 3 + 4 Sum is  7");
}