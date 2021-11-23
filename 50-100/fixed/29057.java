@org.junit.Test
public void testControllerInvalidType() {
    io.craigmiller160.locus.util.LocusStorage storage = getStorage();
    io.craigmiller160.locus.LocusController locusController = new io.craigmiller160.locus.LocusController(storage);
    storage.addControllerType("ControllerOne", io.craigmiller160.locus.sample.ControllerOne.class, false);
    boolean exceptionThrown = false;
    try {
        java.lang.Object cOne = locusController.getController("ControllerOne", java.lang.String.class);
    } catch (io.craigmiller160.locus.LocusInvalidTypeException ex) {
        exceptionThrown = true;
        io.craigmiller160.locus.LocusControllerTest.logger.error("Invalid Type Stack Trace", ex);
    }
    org.junit.Assert.assertTrue("No exception was thrown", exceptionThrown);
}