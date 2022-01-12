public static java.util.ArrayList<be.uclouvain.lsinf1225.v.bartender.model.Ingredient> getInsufficient() {
    be.uclouvain.lsinf1225.v.bartender.dao.DaoIngredient.refreshStock();
    java.util.ArrayList<be.uclouvain.lsinf1225.v.bartender.model.Ingredient> insufficient = new java.util.ArrayList<>();
    for (be.uclouvain.lsinf1225.v.bartender.model.Ingredient ingredient : be.uclouvain.lsinf1225.v.bartender.dao.DaoIngredient.sStock) {
        if ((ingredient.getRemaining()) < (ingredient.getCritical())) {
            insufficient.add(ingredient);
        }
    }
    return insufficient;
}