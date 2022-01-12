@java.lang.Override
public ru.javawebinar.topjava.model.UserMeal get(int id, int userId) {
    java.util.List<ru.javawebinar.topjava.model.UserMeal> userMeals = em.createNamedQuery(UserMeal.GET_BY_ID, ru.javawebinar.topjava.model.UserMeal.class).setParameter(1, userId).setParameter(2, id).getResultList();
    if (!(userMeals.isEmpty())) {
        if ((userMeals.get(0).getUser().getId()) == userId) {
            return userMeals.get(0);
        }else
            return null;
        
    }else
        return null;
    
}