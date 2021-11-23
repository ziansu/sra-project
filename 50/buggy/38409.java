public void confirmationToDrinkOrdered(android.view.View view) {
    buildRecipe(drinkOrder);
    new com.example.lamperry.smartbar_r1.ConfirmationActivity.DrinkOrder().execute();
}