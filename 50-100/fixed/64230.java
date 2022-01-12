@java.lang.Override
protected void doGet(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws java.io.IOException, javax.servlet.ServletException {
    java.util.List<com.candylife.model.Meal> allMeals = com.candylife.service.MealService.showAll();
    java.io.PrintWriter writer = resp.getWriter();
    if (!(allMeals.isEmpty())) {
        writer.println(com.candylife.builder.MessageBuilder.buildStringFromList(allMeals));
    }else {
        writer.println(ServletConstant.EMPTY_SET);
    }
}