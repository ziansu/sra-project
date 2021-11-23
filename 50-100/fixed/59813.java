public static void addFoodPinion(com.stand_still.foodpinions.classes.FoodPinion foodPinion, android.content.Context context) {
    com.stand_still.foodpinions.classes.DatabaseHandler dbHandler = new com.stand_still.foodpinions.classes.DatabaseHandler(context);
    dbHandler.addFoodPinion(foodPinion);
    com.stand_still.foodpinions.classes.FoodPinion addedFoodPinion = dbHandler.getFoodPinionByPair(foodPinion.getDish(), foodPinion.getUser());
    foodPinion.setID(addedFoodPinion.getID());
}