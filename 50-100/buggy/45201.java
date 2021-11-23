@javafx.fxml.FXML
protected void saveData(javafx.event.ActionEvent event) {
    com.CS6359Team1.RecipeBook.DbClass db = new com.CS6359Team1.RecipeBook.DbClass();
    javafx.collections.ObservableList<com.CS6359Team1.RecipeBook.IngredientProperty> ingredientsNameList = ingredientsTableView.getItems();
    javafx.collections.ObservableList<com.CS6359Team1.RecipeBook.DirectionProperty> directionNameList = directionsTableView.getItems();
    int recipeID;
    db.connect();
    recipeID = db.createRecipe(recipe.getRecipeName(), "filler category");
    for (com.CS6359Team1.RecipeBook.IngredientProperty ingredientProperty : ingredientsNameList) {
        db.addIngredient(recipeID, ingredientProperty.getIngredientObject());
    }
    db.disconnect();
}