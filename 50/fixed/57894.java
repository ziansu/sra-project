@org.springframework.web.bind.annotation.RequestMapping(value = "/modifyIngredients", method = org.springframework.web.bind.annotation.RequestMethod.POST, consumes = "application/json")
public java.util.List<edu.unl.csce361.group4.cookbook.Ingredient> modifyIngredients(@org.springframework.web.bind.annotation.RequestBody
java.util.LinkedList<edu.unl.csce361.group4.cookbook.Ingredient> ingredients) {
    ingredientDAO.modify(ingredients);
    return ingredients;
}