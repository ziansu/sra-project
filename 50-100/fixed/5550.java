public double snackPrice(int snack) {
    double snackprice = 0;
    com.vstevam.gigabyte.dao.SnackIngredientsDAO SIDAO = new com.vstevam.gigabyte.dao.SnackIngredientsDAO();
    com.vstevam.gigabyte.dao.IngredientDAO IDAO = new com.vstevam.gigabyte.dao.IngredientDAO();
    java.util.List<java.lang.Integer> si = SIDAO.getAllbySnack(snack);
    if (si.isEmpty()) {
        java.util.List<com.vstevam.gigabyte.entities.Ingredient> ingredients = IDAO.getAllbySnackIngredients(si);
        for (com.vstevam.gigabyte.entities.Ingredient ingredient : ingredients) {
            snackprice = snackprice + (ingredient.getPrice());
        }
    }
    return snackprice;
}