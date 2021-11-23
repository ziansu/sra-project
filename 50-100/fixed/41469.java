@org.junit.Test
public void testFailureMethodsReturnFailureNormally() {
    assertFailedRestResult(() -> applicableController.failingGetMethod());
    assertFailedRestResult(() -> applicableController.failingPostMethod());
    assertFailedRestResult(() -> applicableController.failingPutMethod());
    assertFailedRestResult(() -> applicableController.failingDeleteMethod());
}