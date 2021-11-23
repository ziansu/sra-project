protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    request.setAttribute("livreur", this.livreurService.find(((java.lang.String) (request.getParameter("id")))));
    if ((request.getParameter("del")) != null) {
        deleteLivreur(request, response);
    }else {
        javax.servlet.RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/views/livreurs/editerLivreur.jsp");
        dispatcher.forward(request, response);
    }
}