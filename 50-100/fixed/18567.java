protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    response.getWriter().append("Served at: ").append(request.getContextPath());
    beans.Person p = servlets.BeanProcessor.loadABeanFromDatabaseByGivenId(3);
    servlets.Dispatcher.log.info("Person bean is ready now");
    servlets.Dispatcher.log.info(p.toString());
    request.setAttribute("pBean", p);
    goToPage("/Forms/Form001.jsp", request, response);
}