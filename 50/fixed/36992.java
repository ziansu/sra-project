@org.springframework.web.bind.annotation.RequestMapping(value = "userRecipes/{id}", method = org.springframework.web.bind.annotation.RequestMethod.PUT)
java.lang.Integer modifyRecipe(@org.springframework.web.bind.annotation.PathVariable(value = "id")
java.lang.Integer id, @org.springframework.web.bind.annotation.RequestBody
java.lang.String data) {
    java.lang.Integer code = recipesManager.modifyRecipe(id, data);
    return code;
}