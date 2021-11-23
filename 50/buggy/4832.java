@org.junit.After
public void tearDown() throws java.lang.Exception {
    graphic.Fenetre f = container.getExistingService(graphic.Fenetre.class);
    if (f != null)
        f.waitUntilExit();
    
    org.junit.Assert.assertEquals(ErrorCode.NO_ERROR, container.destructor());
}