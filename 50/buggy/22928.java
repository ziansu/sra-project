public void updateMeal(int id, ru.javawebinar.topjava.model.Meal m) {
    ru.javawebinar.topjava.DAO.MealDao.mealInMemory.put(id, m);
}