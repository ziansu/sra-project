public void addMeal(ru.javawebinar.topjava.model.Meal m) {
    if (ru.javawebinar.topjava.DAO.MealDao.mealInMemory.containsKey(m.getId())) {
        ru.javawebinar.topjava.DAO.MealDao.mealInMemory.put(m.getId(), m);
    }else {
        m.setId(getNewId());
        ru.javawebinar.topjava.DAO.MealDao.mealInMemory.put(m.getId(), m);
    }
}