@org.springframework.web.bind.annotation.RequestMapping(value = { "" , "/" , "/index" })
public java.lang.String getIndexPage(org.springframework.ui.Model model) {
    java.util.Optional<guru.springframework.domain.Category> categoryOptional = categoryRepository.findByDescription("American");
    java.util.Optional<guru.springframework.domain.UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");
    java.lang.System.out.println(("Cat Id is: " + (categoryOptional.get().getId())));
    java.lang.System.out.println(("UOM ID is: " + (unitOfMeasureOptional.get().getId())));
    java.util.Set recipeList = recipeService.getRecipes();
    model.addAttribute("recipes", recipeList);
    return "index";
}