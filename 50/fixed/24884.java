public void getDrinks() {
    java.lang.System.out.println("Drinks:");
    for (FoodItem foodItem : refrigeratorSpace) {
        if (foodItem != null) {
            if (foodItem.getTypeOfFood().equals("drink")) {
                foodItem.print();
            }
        }
    }
}