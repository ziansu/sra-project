private static void formatNames(java.util.Map<java.lang.Integer, dinnerdecider.Meal> meals) {
    for (int num : meals.keySet()) {
        dinnerdecider.Meal newMeal = meals.get(num);
        java.lang.String newName = newMeal.getName().replace('-', ' ');
        meals.put(num, new dinnerdecider.Meal(newName, newMeal.getFilters()));
    }
}