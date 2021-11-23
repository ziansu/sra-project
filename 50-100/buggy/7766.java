@java.lang.Override
void init(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    javax.servlet.RequestDispatcher dispatcher = null;
    java.util.List<fr.eni.expeditor.entity.Article> lstArticle = gestionArticleBean.rechercherTous();
    request.setAttribute("lstArticle", lstArticle);
    fr.eni.expeditor.servlet.GestionArticleServlet.LOGGER.info("toto");
    dispatcher = request.getRequestDispatcher("/WEB-INF/views/manager/gestionArticle.jsp");
    dispatcher.forward(request, response);
}