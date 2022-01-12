@org.junit.Test
public void testCastedCompose() {
    ru.spbau.mit.Function1<java.lang.Object, java.lang.String> objectToStr = new ru.spbau.mit.Function1<java.lang.Object, java.lang.String>() {
        @java.lang.Override
        public java.lang.String apply(java.lang.Object arg) {
            return arg.toString();
        }
    };
    ru.spbau.mit.Function1<java.lang.String, java.lang.Integer> strToInt = new ru.spbau.mit.Function1<java.lang.String, java.lang.Integer>() {
        @java.lang.Override
        public java.lang.Integer apply(java.lang.String arg) {
            return arg.length();
        }
    };
    org.junit.Assert.assertEquals("11", strToInt.compose(objectToStr).apply("lorem ipsum"));
}