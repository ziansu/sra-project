@org.junit.Test
public void Set_Name() {
    extendedIngredientModel.setName("test");
    org.junit.Assert.assertEquals(extendedIngredientModel.getName(), "test");
}