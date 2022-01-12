@org.junit.Test
public void shouldReturnCorrectCostValuesUsingTechnology() throws java.lang.Exception {
    productCostCalc.calculateProductsCost(costCalculation);
    org.mockito.Mockito.verify(numberService).setScale(expectedResult);
    org.mockito.Mockito.verify(costCalculation).setField(org.mockito.Mockito.eq("totalMaterialCosts"), org.mockito.Matchers.any(java.math.BigDecimal.class));
}