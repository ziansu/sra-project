protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    try {
        request.setAttribute("foodOriginResult", controller.FoodOriginDAO.foodOriginlist());
        request.setAttribute("foodTypeResult", controller.FoodTypeDAO.foodTypelist());
        request.setAttribute("prepTimeResult", controller.PrepTimeDAO.prepTime());
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    request.getRequestDispatcher("jsp/RecipeEntry.jsp").forward(request, response);
    response.sendRedirect("jsp/RecipeEntry.jsp");
}