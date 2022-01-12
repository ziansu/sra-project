@org.junit.Test
public void testUpdateDispatch() {
    final org.cats.stock.domain.Dispatch savedDispatch = stubServiceToReturnStoredDispatch();
    org.cats.stock.domain.Dispatch updatedDispatch = null;
    try {
        updatedDispatch = dispatchController.updateDispatch(savedDispatch.getId(), savedDispatch);
        org.mockito.Mockito.verify(dispatchService, org.mockito.Mockito.times(1)).update(savedDispatch);
    } catch (javassist.NotFoundException e) {
        fail("shouldn't throw not found exception");
    }
    assertEquals(savedDispatch, updatedDispatch);
}