@org.junit.Test
public void setVegetarian() {
    recipeModel.setVegetarian(true);
    org.junit.Assert.assertEquals(recipeModel.getVegetarian(), true);
}