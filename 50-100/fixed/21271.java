public static void registerIngredient(final binnie.extratrees.alcohol.ICocktailIngredient ingredient) {
    binnie.extratrees.alcohol.Cocktail.cocktailIngredients.put(ingredient.getIdentifier().toLowerCase(), ingredient);
    binnie.extratrees.alcohol.drink.DrinkManager.registerDrinkLiquid(ingredient.getIdentifier().toLowerCase(), new binnie.extratrees.alcohol.drink.DrinkLiquid(ingredient.getName(), ingredient.getColor(), ingredient.getTransparency(), ingredient.getABV()));
}