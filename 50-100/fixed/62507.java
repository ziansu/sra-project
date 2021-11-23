protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    java.lang.String idCateg = request.getParameter("id");
    be.shop.entity.Categorie categ = categorieServices.findById(java.lang.Long.parseLong(idCateg));
    java.util.List<be.shop.entity.Article> articles = articleServices.findByCateg(categ);
    request.setAttribute("articles", articles);
    request.getRequestDispatcher("/WEB-INF/views/displayListArticles.jsp").forward(request, response);
}