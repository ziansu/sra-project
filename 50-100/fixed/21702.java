@org.junit.Test
public void testCurry() {
    final int arg1 = 42;
    final double arg2 = 0.123;
    ru.spbau.mit.Function2<java.lang.Integer, java.lang.Double, java.lang.String> fun2 = new ru.spbau.mit.Function2<java.lang.Integer, java.lang.Double, java.lang.String>() {
        @java.lang.Override
        public java.lang.String apply(java.lang.Integer arg1, java.lang.Double arg2) {
            return (arg1.toString()) + (arg2.toString());
        }
    };
    org.junit.Assert.assertEquals("420.123", fun2.curry().apply(arg1).apply(arg2));
}