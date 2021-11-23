@org.junit.Test
public void testRemoveAdjustmentFactor() {
    this.lookupController.removeAdjustmentFactor(1L);
    org.mockito.Mockito.verify(this.factorService, org.mockito.Mockito.atLeastOnce()).deleteOrderQuantityAdjustmentFactor(org.mockito.Matchers.any(org.openlmis.core.domain.OrderQuantityAdjustmentFactor.class));
}