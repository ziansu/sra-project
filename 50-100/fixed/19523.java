@org.junit.Test
public void testGetControllerWrongName() {
    io.craigmiller160.locus.util.LocusStorage storage = getStorage();
    io.craigmiller160.locus.LocusController locusController = new io.craigmiller160.locus.LocusController(storage);
    storage.addControllerType("ControllerOne", io.craigmiller160.locus.sample.ControllerOne.class, false);
    boolean exceptionThrown = false;
    try {
        java.lang.Object controller = locusController.getController("ControlerOne");
    } catch (io.craigmiller160.locus.LocusNoControllerException ex) {
        exceptionThrown = true;
        io.craigmiller160.locus.LocusControllerTest.logger.error("Wrong Name Stack Trace", ex);
    }
    org.junit.Assert.assertTrue("Exception was not thrown for wrong name", exceptionThrown);
}