@java.lang.Override
@org.springframework.transaction.annotation.Transactional
public ru.javawebinar.topjava.model.Meal save(ru.javawebinar.topjava.model.Meal meal, int userId) {
    meal.setUser(em.getReference(ru.javawebinar.topjava.model.User.class, userId));
    if (meal.isNew()) {
        em.persist(meal);
    }else {
        if ((em.find(ru.javawebinar.topjava.model.Meal.class, meal.getId()).getUser().getId()) == userId) {
            em.merge(meal);
        }else {
            meal = null;
        }
    }
    return meal;
}