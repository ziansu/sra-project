@org.junit.Test
public void shouldThrowDataExceptionIfProductIsInvalid() throws java.lang.Exception {
    setupStockData();
    expectedException.expect(org.openlmis.core.exception.DataException.class);
    expectedException.expectMessage("error.product.unknown");
    when(facilityRepository.getById(facilityId)).thenReturn(defaultFacility);
    when(productService.getByCode(productCode)).thenReturn(null);
    restStockCardService.adjustStock(facilityId, stockEventList, userId);
}