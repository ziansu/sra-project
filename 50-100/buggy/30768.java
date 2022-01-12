@org.junit.Test
public void testNewReal_IReal_String() {
    it.cnr.istc.iloc.ac.ACNetworkTest.LOG.info("newReal");
    it.cnr.istc.iloc.api.core.IReal real = null;
    java.lang.String constant = "";
    it.cnr.istc.iloc.ac.ACNetwork instance = null;
    it.cnr.istc.iloc.api.ISimpleConstraintNetwork.IRealVar expResult = null;
    it.cnr.istc.iloc.api.ISimpleConstraintNetwork.IRealVar result = instance.newReal(real, constant);
    assertEquals(expResult, result);
    fail("The test case is a prototype.");
}