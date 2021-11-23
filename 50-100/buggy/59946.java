protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    try {
        java.lang.String username = request.getParameter("LoginUserName");
        java.lang.String password = request.getParameter("LoginPassword");
        java.lang.System.out.println("hello");
        lk.travelguide.controllers.Login obj = new lk.travelguide.controllers.Login();
        obj.authentication(username, password);
        java.lang.System.out.println("world");
    } catch (java.lang.Throwable theException) {
        java.lang.System.out.println(theException);
    }
}