public void setIngredient(net.blay09.mods.cookingbook.registry.food.FoodIngredient ingredient) {
    this.ingredient = ingredient;
    if (ingredient == null) {
        putStack(null);
    }
}