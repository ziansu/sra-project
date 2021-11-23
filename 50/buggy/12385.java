@org.junit.Test
public void testLoadSimpleLib() throws java.lang.Throwable {
    facade.L42.main(new java.lang.String[]{ "examples/testsForAdamTowel01/UseSimpleLib.L42" });
    org.junit.Assert.assertEquals(L42.record.toString(), "Template\nBox\n------------------------------\nEND (zero for success): 0");
}