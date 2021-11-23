public void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    java.lang.String requestString = request.getReader().readLine();
    java.lang.System.out.println(requestString);
    java.lang.String header = request.getHeader("Delete");
    if (header != null) {
        doPostDeleteCourse(request, response, requestString);
        return ;
    }
    doPostAddCourse(request, response, requestString);
}