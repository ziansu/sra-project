@org.junit.Test
public void testADDAWithCarry() {
    int[] instructions = new int[]{ 139 , 255 };
    loadProg(instructions);
    myTestCPU.cc.bit_c = 0;
    myTestCPU.a.set(3);
    myTestCPU.execute();
    org.junit.Assert.assertEquals(2, myTestCPU.a.intValue());
    org.junit.Assert.assertFalse(myTestCPU.cc.isSetN());
    org.junit.Assert.assertTrue(myTestCPU.cc.isSetV());
    org.junit.Assert.assertTrue(myTestCPU.cc.isSetC());
}