private static double calculateQ1(Shop s) {
    double ingredientRatio = (s.recipe.coffee) / (Model.coffeeMax);
    if (ingredientRatio < ((double) (2 / 3))) {
        return 1.5 * ingredientRatio;
    }else {
        return ((1 - ingredientRatio) * 1.5) + 0.5;
    }
}