@org.junit.Test
public void setAmount() {
    extendedIngredientModel.setAmount(12.0);
    org.junit.Assert.assertEquals(extendedIngredientModel.getAmount(), 12.0, 0);
}