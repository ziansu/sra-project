protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    fr.pizzeria.model.Livreur livreur = new fr.pizzeria.model.Livreur();
    livreur.setNom(request.getParameter("nom"));
    livreur.setPrenom(request.getParameter("prenom"));
    this.livreurService.update(java.lang.Integer.parseInt(request.getParameter("id")), livreur);
    response.sendRedirect(((request.getContextPath()) + "/livreurs/list"));
}