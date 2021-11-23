protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    java.io.PrintWriter out = response.getWriter();
    response.setContentType(com.foodstore.serg.controller.CONTENT_TYPE);
    java.util.List<com.foodstore.serg.model.Meal> meals = com.foodstore.serg.service.MealService.getAll();
    if (meals.isEmpty()) {
        request.setAttribute("message", com.foodstore.serg.controller.NO_PRODUCT);
    }else {
        request.setAttribute("success_message", com.foodstore.serg.controller.LIST_OF_MEALS);
        request.setAttribute("food", meals);
    }
    getServletContext().getRequestDispatcher("/dashboard.jsp").forward(request, response);
}