@org.junit.Test
public void setName() {
    extendedIngredientModel.setName("test");
    org.junit.Assert.assertEquals(extendedIngredientModel.getName(), "test");
}