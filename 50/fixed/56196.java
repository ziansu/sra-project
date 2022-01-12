@org.junit.Test
public void testDeleteSeasonalRationingType() {
    org.openlmis.core.domain.OrderQuantityAdjustmentType adjustmentType = new org.openlmis.core.domain.OrderQuantityAdjustmentType();
    lookupController.deleteSeasonalRationingType(adjustmentType);
    org.mockito.Mockito.verify(typeService).deleteOrderQuantityAdjustmentType(adjustmentType);
}