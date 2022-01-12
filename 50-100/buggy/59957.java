private void populateListView() {
    this.planLength = 30;
    doctorj.mealplan.MealPlan plan = new doctorj.mealplan.MealPlan(planLength);
    java.lang.String[] mealNames = new java.lang.String[]{ "Grilled Cheese" , "Alfredo" , "Spaghetti" };
    android.widget.ArrayAdapter<java.lang.String> adapter = new android.widget.ArrayAdapter<java.lang.String>(this, R.layout.meal_items, mealNames);
    android.widget.ListView mealTag = ((android.widget.ListView) (findViewById(R.id.MealList)));
    mealTag.setAdapter(adapter);
}