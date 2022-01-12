@java.lang.Override
public void createRecipeComponent(dto01917.RecipeComponentDTO recipeComponent) throws daointerfaces01917.DALException {
    connector01917.Connector.doUpdate(daoimpl01917.Queries.getFormatted("recipecomponent.insert", java.lang.Integer.toString(recipeComponent.getRecipeId()), java.lang.Integer.toString(recipeComponent.getIngredientId()), java.lang.Double.toString(recipeComponent.getNominatedNetWeight()), java.lang.Double.toString(recipeComponent.getTolerance())));
}