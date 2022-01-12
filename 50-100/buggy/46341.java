private de.hof.university.app.model.meal.Meals getMeals(final android.content.Context context) {
    if ((this.meals) == null) {
        java.lang.Object obtMealsObj = de.hof.university.app.data.DataManager.readObject(context, Define.mealsFilename);
        if (obtMealsObj instanceof de.hof.university.app.model.meal.Meals) {
            this.meals = ((de.hof.university.app.model.meal.Meals) (obtMealsObj));
        }else {
            this.meals = new de.hof.university.app.model.meal.Meals();
        }
    }
    return this.meals;
}