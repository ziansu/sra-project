@org.junit.Test
public void lambda() {
    java.util.function.Function<java.lang.Integer, java.lang.Integer> inc = ( i) -> i + 1;
    org.junit.Assert.assertEquals(java.lang.Integer.valueOf(3), inc.apply(2));
}