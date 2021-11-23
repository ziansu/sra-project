@java.lang.Override
public ru.javawebinar.topjava.model.Meal get(int id, int userId) {
    java.util.List<ru.javawebinar.topjava.model.Meal> meals = em.createNamedQuery(Meal.MEAL_BY_ID, ru.javawebinar.topjava.model.Meal.class).setParameter("id", id).setParameter("user_id", userId).getResultList();
    return org.springframework.dao.support.DataAccessUtils.singleResult(meals);
}