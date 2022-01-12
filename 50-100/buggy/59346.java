@java.lang.Override
public void run(org.springframework.boot.ApplicationArguments args) throws java.lang.Exception {
    se.nackademin.domain.Recipe fisksoppa = new se.nackademin.domain.Recipe("fisksoppa", "med fiskbullar");
    fisksoppa.getRecipeItems().add(new se.nackademin.domain.RecipeItem(new se.nackademin.domain.Ingredient("Fisk"), new se.nackademin.domain.Unit("st"), 2));
    fisksoppa.getRecipeItems().add(new se.nackademin.domain.RecipeItem(new se.nackademin.domain.Ingredient("Bulle"), new se.nackademin.domain.Unit("st"), 1));
    service.addRecipe(fisksoppa);
}