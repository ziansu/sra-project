@org.junit.Test
public void testRemoveSeasonRationingType() {
    org.openlmis.core.domain.OrderQuantityAdjustmentType adjustmentType = new org.openlmis.core.domain.OrderQuantityAdjustmentType();
    lookupController.removeSeasonRationingType(1L);
    org.mockito.Mockito.verify(typeService).deleteOrderQuantityAdjustmentType(adjustmentType);
}