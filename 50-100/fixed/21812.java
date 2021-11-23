@org.junit.Test
public void testGetControllerNonSingleton() {
    io.craigmiller160.locus.util.LocusStorage storage = getStorage();
    io.craigmiller160.locus.LocusController locusController = new io.craigmiller160.locus.LocusController(storage);
    storage.addControllerType("ControllerOne", io.craigmiller160.locus.sample.ControllerOne.class, false);
    java.lang.Object controller = locusController.getController("ControllerOne");
    org.junit.Assert.assertNotNull("Controller is null", controller);
    org.junit.Assert.assertEquals("Controller wrong type", controller.getClass(), io.craigmiller160.locus.sample.ControllerOne.class);
}