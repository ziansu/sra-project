@org.junit.Test
public void Set_Amount() {
    extendedIngredientModel.setAmount(12.0);
    org.junit.Assert.assertEquals(extendedIngredientModel.getAmount(), 12.0, 0);
}