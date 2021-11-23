public static play.mvc.Result list() {
    controllers.List<controllers.Meal> meals = controllers.Meal.findAll();
    return TODO;
}