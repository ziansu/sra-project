private void getProjects(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, Data.Controller con) throws java.io.IOException, javax.servlet.ServletException {
    java.util.ArrayList<Data.Project> projects = con.getProjects();
    if ((projects.size()) > 0) {
        java.lang.System.out.println("Empty List");
    }
    if (projects == null) {
    }
    request.setAttribute("projects", projects);
    getStateNames(request, response, con);
    javax.servlet.RequestDispatcher rq = request.getRequestDispatcher("view.jsp");
    rq.forward(request, response);
}