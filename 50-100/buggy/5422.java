private static double calculateQ2(Shop s) {
    double ingredientRatio = (s.recipe.milk) / (Model.milkMax);
    if (ingredientRatio < ((double) (2 / 3))) {
        return 1.5 * ingredientRatio;
    }else {
        return (1 - ingredientRatio) * 3;
    }
}