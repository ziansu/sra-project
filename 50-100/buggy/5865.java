@org.junit.Test
public void shouldThrowDataExceptionIfProductIsInvalid() throws java.lang.Exception {
    setupStockData();
    expectedException.expect(org.openlmis.core.exception.DataException.class);
    expectedException.expectMessage("error.product.unknown");
    org.mockito.Mockito.when(facilityRepository.getById(facilityId)).thenReturn(defaultFacility);
    org.mockito.Mockito.when(productService.getByCode(productCode)).thenReturn(null);
    restStockCardService.adjustStock(facilityId, stockEventList, userId);
}