@org.junit.Test
public void testAddMissingParameterValueAnnotation() throws java.lang.Exception {
    createTargetClass(org.jboss.forge.addon.parser.java.ui.JavaAddAnnotationCommandTest.TEST_CLASS_STRING);
    createCommandController();
    commandController.initialize();
    java.lang.String complexAnnotation = "Test(param1=)";
    commandController.setValueFor("annotation", complexAnnotation);
    try {
        commandController.execute();
        org.junit.Assert.fail("IllegalArgumentException should be thrown.");
    } catch (java.lang.IllegalArgumentException ex) {
        org.junit.Assert.assertTrue(ex.getMessage().contains("Parameter \"param1\" is missing or is incomplete."));
    }
}