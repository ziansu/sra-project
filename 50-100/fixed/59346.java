@java.lang.Override
public void run(org.springframework.boot.ApplicationArguments args) throws java.lang.Exception {
    se.nackademin.domain.Recipe fisksoppa = new se.nackademin.domain.Recipe("fisksoppa", "med fiskbullar");
    fisksoppa.getRecipeItems().add(new se.nackademin.domain.RecipeItem(new se.nackademin.domain.Ingredient("Fisk"), 2, new se.nackademin.domain.Unit("st")));
    fisksoppa.getRecipeItems().add(new se.nackademin.domain.RecipeItem(new se.nackademin.domain.Ingredient("Bulle"), 1, new se.nackademin.domain.Unit("st")));
    service.addRecipe(fisksoppa);
}