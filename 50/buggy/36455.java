@org.junit.Test
public void testHashSetParametrized() {
    java.util.Set<java.lang.Integer> s = createResizedDS(0, 100000);
    this.parameterized(s, s, s.toString());
}