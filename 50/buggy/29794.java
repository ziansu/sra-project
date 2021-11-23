@java.lang.Override
public void update(int userId, ru.javawebinar.topjava.model.Meal meal) {
    repository.save(meal);
}