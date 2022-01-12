@org.junit.Test
public void testArrayPutShort() {
    gnu.trove.map.TIntObjectMap<java.lang.Object> initial = org.cf.smalivm.VMTester.buildRegisterState(0, new short[1], 1, 0, 2, 66);
    gnu.trove.map.TIntObjectMap<java.lang.Object> expected = org.cf.smalivm.VMTester.buildRegisterState(0, new short[]{ 66 });
    org.cf.smalivm.VMTester.testMethodState(org.cf.smalivm.opcode.TestAPutOp.CLASS_NAME, "TestArrayPutShort()V", initial, expected);
}