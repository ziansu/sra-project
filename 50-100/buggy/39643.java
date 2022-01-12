@java.lang.Override
protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    java.lang.String fname = request.getParameter("fname");
    java.lang.String lname = request.getParameter("lname");
    java.lang.String username = request.getParameter("username");
    java.lang.String email = request.getParameter("email");
    uk.ac.dundee.computing.aec.instagrim.models.User us = new uk.ac.dundee.computing.aec.instagrim.models.User();
    us.setCluster(cluster);
    us.changeUserProfile(fname, lname, username, email);
    response.sendRedirect("UserProfile");
}