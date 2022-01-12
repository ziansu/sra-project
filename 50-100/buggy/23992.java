protected void processRequest(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    java.lang.String[] ids = request.getParameterValues("id");
    int id = java.lang.Integer.parseInt(ids[0]);
    request.setAttribute("internship", getProposedInternship(id));
    request.setAttribute("candidats", listCandidates(id));
    this.getServletContext().getRequestDispatcher("/pagesCompany/description.jsp").forward(request, response);
}