public void initFoodList(com.luvsoft.entities.Category cate) {
    java.util.List<com.luvsoft.entities.Food> foodList = new java.util.ArrayList<com.luvsoft.entities.Food>();
    if (cate != null) {
        com.luvsoft.facades.FoodFacade foodFacade = new com.luvsoft.facades.FoodFacade();
        for (java.lang.String foodId : cate.getFoodIdList()) {
            com.luvsoft.entities.Food food = new com.luvsoft.entities.Food();
            if (foodFacade.findById(foodId, food)) {
                foodList.add(food);
            }
            CachedData.categoriesMaps.put(cate.getId(), foodList);
        }
    }
}