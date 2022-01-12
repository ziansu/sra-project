@org.junit.Test
public void testCheckIfBehindNat_Fail() {
    try {
        drService.checkIfBehindNat(null, "");
        org.junit.Assert.fail();
    } catch (java.lang.Exception e) {
    }
    try {
        natCheckParam.setIPv4Address("10.247.0.1");
        drService.checkIfBehindNat(natCheckParam, null);
        org.junit.Assert.fail();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}