@org.junit.Test(expected = java.security.InvalidParameterException.class)
public void IDConstructor() {
    it.simonedegiacomi.goboxapi.GBFile gbFile = new it.simonedegiacomi.goboxapi.GBFile(5);
    assertEquals(5, gbFile.getID());
    assertEquals(GBFile.UNKNOWN_ID, gbFile.getFatherID());
    it.simonedegiacomi.goboxapi.GBFile invalid = new it.simonedegiacomi.goboxapi.GBFile((-5));
}