protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    fr.epf.models.Promotion[] promotions = promoDAO.findAll();
    request.setAttribute("promotions", promotions);
    request.getRequestDispatcher("/WEB-INF/add_member.jsp").forward(request, response);
}