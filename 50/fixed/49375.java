@org.junit.Test
public void testFindFactors() {
    java.util.Set<java.lang.Integer> list = algorithms.findFactors(1030);
    list.forEach(( l) -> java.lang.System.out.println(l.intValue()));
}