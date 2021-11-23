@org.junit.Test
public void preMadeRecipesAreAVailable() {
    java.util.Set<fr.unice.polytech.isa.tcf.entities.Cookies> premade = catalogue.listPreMadeRecipes();
    assertEquals(3, premade.size());
}