@java.lang.Override
public void update(int userId, ru.javawebinar.topjava.model.Meal meal) {
    if (userId != (meal.getUserId())) {
        throw new ru.javawebinar.topjava.util.exception.NotFoundException("");
    }
    save(userId, meal);
}