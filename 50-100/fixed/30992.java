@org.junit.Test
public void findByBarcodeAndCustomerCode() {
    saveSingleBibHoldingsItem();
    java.util.List<org.recap.model.jpa.ItemEntity> itemEntityList = itemDetailsRepository.findByBarcodeAndCustomerCode("12316433", "PA");
    assertNotNull(itemEntityList);
    assertEquals("12316433", itemEntityList.get(0).getBarcode());
    assertEquals("PA", itemEntityList.get(0).getCustomerCode());
}