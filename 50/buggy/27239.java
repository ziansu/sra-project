@org.springframework.web.bind.annotation.RequestMapping(value = "/deleteIngredients", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.util.List<edu.unl.csce361.group4.cookbook.Ingredient> deleteIngredients(java.util.List<edu.unl.csce361.group4.cookbook.Ingredient> ingredients) {
    ingredientDAO.delete(ingredients);
    return ingredients;
}