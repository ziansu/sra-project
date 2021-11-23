@org.junit.Test
public final void testGetInstance() {
    nl.tudelft.scrumbledore.Logger logger2 = nl.tudelft.scrumbledore.Logger.getInstance();
    org.junit.Assert.assertEquals(logger, logger2);
}