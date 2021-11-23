@org.junit.Test
public void test_recipes() {
    java.util.ArrayList<java.lang.String> recipes = access.getRecipes();
    java.util.ArrayList<java.lang.String> all = access.getAllIngredients();
    for (java.lang.String i : all) {
        java.util.ArrayList<java.lang.String> ingred = access.getIngredients(i);
        for (java.lang.String j : ingred) {
            org.junit.Assert.assertTrue(all.contains(j));
        }
    }
}