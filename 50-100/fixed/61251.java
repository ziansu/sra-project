protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    if ((request.getParameter("id")) != null) {
        if (!(retrieveEncounter(request))) {
            response.sendRedirect(((request.getContextPath()) + "/Home"));
            return ;
        }
    }
    getServletContext().getRequestDispatcher("/Encounter.jsp").forward(request, response);
}