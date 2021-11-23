@org.junit.Test
public void testControllerSpecificType() {
    io.craigmiller160.locus.LocusController locusController = new io.craigmiller160.locus.LocusController();
    io.craigmiller160.locus.util.LocusStorage storage = getStorage();
    storage.addControllerType("ControllerOne", io.craigmiller160.locus.sample.ControllerOne.class, false);
    io.craigmiller160.locus.sample.ControllerOne cOne = locusController.getController("ControllerOne", io.craigmiller160.locus.sample.ControllerOne.class);
    org.junit.Assert.assertNotNull("Controller instance is null", cOne);
    org.junit.Assert.assertEquals("Controller instance is wrong type", cOne.getClass(), io.craigmiller160.locus.sample.ControllerOne.class);
}