@org.junit.Test
public void setInstructions() {
    recipeModel.setInstructions("test");
    org.junit.Assert.assertEquals(recipeModel.getInstructions(), "test");
}