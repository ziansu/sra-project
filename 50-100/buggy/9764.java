@org.junit.Test
public void testOverflow3() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, org.spf4j.zel.vm.CompileException {
    org.spf4j.zel.vm.Program p = org.spf4j.zel.vm.Program.compile(((("" + (java.lang.Long.MIN_VALUE)) + " - ") + (java.lang.Long.MAX_VALUE)));
    java.lang.System.out.println(p);
    java.math.BigInteger result = ((java.math.BigInteger) (p.execute()));
    org.junit.Assert.assertEquals(java.math.BigInteger.valueOf(java.lang.Long.valueOf(java.lang.Long.MIN_VALUE)).subtract(java.math.BigInteger.valueOf(java.lang.Long.valueOf(java.lang.Long.MAX_VALUE))), result);
}