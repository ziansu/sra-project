@org.junit.Test
public void shouldThrowDataExceptionIfFacilityIdIsInvalid() throws java.lang.Exception {
    setupStockData();
    expectedException.expect(org.openlmis.core.exception.DataException.class);
    expectedException.expectMessage("error.facility.unknown");
    org.mockito.Mockito.when(facilityRepository.getById(facilityId)).thenReturn(null);
    org.mockito.Mockito.when(productService.getByCode(productCode)).thenReturn(defaultProduct);
    restStockCardService.adjustStock(facilityId, stockEventList, userId);
}