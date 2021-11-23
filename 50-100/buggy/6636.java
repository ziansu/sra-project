@org.junit.Test
public void testBasicApply() {
    final int arg1 = 123;
    final double arg2 = 3.14;
    ru.spbau.mit.Function2<java.lang.Integer, java.lang.Double, java.lang.String> concat = new ru.spbau.mit.Function2<java.lang.Integer, java.lang.Double, java.lang.String>() {
        @java.lang.Override
        public java.lang.String apply(java.lang.Integer arg1, java.lang.Double arg2) {
            return (arg1.toString()) + (arg2.toString());
        }
    };
    org.junit.Assert.assertEquals(concat.apply(arg1, arg2), "1233.14");
}