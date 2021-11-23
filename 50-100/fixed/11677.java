@org.junit.Test
public void setExtendedIngredients() {
    com.sem4ikt.uni.recipefinderchatbot.model.ExtendedIngredientModel ingredient = new com.sem4ikt.uni.recipefinderchatbot.model.ExtendedIngredientModel();
    ingredient.setImage("test");
    java.util.List<com.sem4ikt.uni.recipefinderchatbot.model.ExtendedIngredientModel> list = new java.util.ArrayList<>();
    list.add(ingredient);
    recipeModel.setExtendedIngredients(list);
    org.junit.Assert.assertEquals(recipeModel.getExtendedIngredients(), list);
}