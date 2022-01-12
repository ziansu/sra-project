private static void formatNames(java.util.List<dinnerdecider.Meal> meals) {
    for (int i = 0; i < (meals.size()); i++) {
        java.lang.String newName = meals.get(i).getName().replace('-', ' ');
        meals.add(new dinnerdecider.Meal(newName, meals.get(i).getFilters()));
        meals.remove(meals.get(i));
    }
}