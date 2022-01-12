@org.junit.Test
public void testNewWhenTheExpectedConstructorIsNotFound() throws java.lang.Exception {
    final java.lang.Object object = new java.lang.Object();
    try {
        org.powermock.api.mockito.PowerMockito.whenNew(samples.expectnew.VarArgsConstructorDemo.class).withArguments(object);
        org.junit.Assert.fail("Should throw ConstructorNotFoundException!");
    } catch (org.powermock.reflect.exceptions.ConstructorNotFoundException e) {
        org.junit.Assert.assertEquals((((("No constructor found in class '" + (samples.expectnew.VarArgsConstructorDemo.class.getName())) + "' with parameter types: [ ") + (object.getClass().getName())) + " ]."), e.getMessage());
    }
}