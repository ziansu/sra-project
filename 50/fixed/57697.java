protected void delete(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    java.lang.String id = request.getParameter("id");
    productService.delete(id);
    response.sendRedirect(((request.getContextPath()) + "/query.jsp"));
}