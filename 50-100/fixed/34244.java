private void createHeader() {
    android.widget.TableRow headerRow = ((android.widget.TableRow) (android.view.LayoutInflater.from(getApplicationContext()).inflate(R.layout.tablecalorie_header_row, null)));
    android.widget.TextView meal = ((android.widget.TextView) (headerRow.findViewById(R.id.textMeal)));
    meal.setText(type);
    android.widget.TextView calories = ((android.widget.TextView) (headerRow.findViewById(R.id.textMealCalorieCount)));
    calories.setText((("" + (mealCalorie)) + " Calories"));
    tableHeaderRow = headerRow;
}