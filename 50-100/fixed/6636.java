@org.junit.Test
public void testBasicApply() {
    ru.spbau.mit.Function2<java.lang.Integer, java.lang.Double, java.lang.String> concat = new ru.spbau.mit.Function2<java.lang.Integer, java.lang.Double, java.lang.String>() {
        @java.lang.Override
        public java.lang.String apply(java.lang.Integer arg1, java.lang.Double arg2) {
            return (arg1.toString()) + (arg2.toString());
        }
    };
    org.junit.Assert.assertEquals("1233.14", concat.apply(123, 3.14));
}