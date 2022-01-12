@org.junit.Test
public void testOverflow2() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, org.spf4j.zel.vm.CompileException {
    org.spf4j.zel.vm.Program p = org.spf4j.zel.vm.Program.compile(((("" + (java.lang.Long.MIN_VALUE)) + " - ") + 1));
    java.lang.System.out.println(p);
    java.math.BigInteger result = ((java.math.BigInteger) (p.execute()));
    org.junit.Assert.assertEquals(java.math.BigInteger.valueOf(java.lang.Long.MIN_VALUE).subtract(java.math.BigInteger.ONE), result);
}