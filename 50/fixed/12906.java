@java.lang.Override
public ru.javawebinar.topjava.model.Meal save(int userId, ru.javawebinar.topjava.model.Meal meal) {
    return repository.save(userId, meal);
}