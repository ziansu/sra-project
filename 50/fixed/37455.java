public static play.mvc.Result deleteMeal() {
    java.lang.String MealID = controllers.RestaurantController.inputForm.bindFromRequest().get().id;
    if ((controllers.Meal.delete(MealID)) == true) {
        return TODO;
    }
    return TODO;
}