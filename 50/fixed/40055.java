@org.junit.Test
public void testDeleteAdjustmentFactor() {
    org.openlmis.core.domain.OrderQuantityAdjustmentFactor adjustmentFactor = new org.openlmis.core.domain.OrderQuantityAdjustmentFactor();
    this.lookupController.deleteAdjustmentFactor(adjustmentFactor);
    org.mockito.Mockito.verify(this.factorService).deleteOrderQuantityAdjustmentFactor(adjustmentFactor);
}