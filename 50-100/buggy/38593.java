@org.junit.Test
@org.junit.Ignore
public void shouldReturnCorrectCostValuesUsingTechnology() throws java.lang.Exception {
    productCostCalc.calculateProductsCost(costCalculation);
    org.mockito.ArgumentCaptor<java.math.BigDecimal> argument = org.mockito.ArgumentCaptor.forClass(java.math.BigDecimal.class);
    org.mockito.Mockito.verify(numberService).setScale(argument.capture());
    org.mockito.Mockito.verify(costCalculation).setField(org.mockito.Mockito.eq("totalMaterialCosts"), org.mockito.Matchers.any(java.math.BigDecimal.class));
    org.junit.Assert.assertEquals(expectedResult, argument.getValue());
}