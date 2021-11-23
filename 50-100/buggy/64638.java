public void changeViewFoodList(android.view.View view) {
    double taken = (userFloat) + (takenPercentage);
    food.set_taken_units(taken);
    userFood.set_user_taken(userFloat);
    db.update_user_food(userFood);
    db.update_food(food, foodTable);
    super.onBackPressed();
}