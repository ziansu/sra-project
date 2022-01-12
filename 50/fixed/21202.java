@java.lang.Override
public void edit(ru.javawebinar.topjava.model.Meal meal) {
    meals.replace(meal.getId(), meal);
}