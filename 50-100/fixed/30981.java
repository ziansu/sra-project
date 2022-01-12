public void addDrinkSupplie(com.week3.DrinkSupply drinkSupplie) {
    for (int i = 0; i < (drinkSupplies.length); i++) {
        if ((drinkSupplies[i]) != null) {
            drinkSupplies[i] = drinkSupplie;
            break;
        }
    }
}