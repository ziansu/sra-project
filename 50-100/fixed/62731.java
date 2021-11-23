@org.junit.Test
public void testBind2() {
    ru.spbau.mit.Function2<java.lang.Integer, java.lang.Double, java.lang.String> fun2 = new ru.spbau.mit.Function2<java.lang.Integer, java.lang.Double, java.lang.String>() {
        @java.lang.Override
        public java.lang.String apply(java.lang.Integer arg1, java.lang.Double arg2) {
            return (arg1.toString()) + (arg2.toString());
        }
    };
    org.junit.Assert.assertEquals("420.123", fun2.bind2(0.123).apply(42));
}