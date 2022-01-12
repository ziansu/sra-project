@com.codeup.controller.GetMapping(value = "/recipe/delete")
public java.lang.String deleteRecipe(@com.codeup.controller.RequestParam(value = "recipe_id")
long recipe_id) {
    com.codeup.controller.User user = ((com.codeup.controller.User) (org.springframework.security.core.context.SecurityContextHolder.getContext().getAuthentication().getPrincipal()));
    com.codeup.controller.UserRecipe userRecipe = userRecipeRepository.findByUser_IdAndRecipe_Id(user.getId(), recipe_id);
    userRecipeRepository.delete(userRecipe);
    com.codeup.controller.Recipe recipe = recipesRepository.findOne(recipe_id);
    recipesRepository.delete(recipe);
    return "redirect:/";
}