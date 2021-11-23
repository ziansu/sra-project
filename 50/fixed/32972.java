@org.junit.Test
public void testBasic4_BigString_CaseInsensitive_ExpectsTrue() {
    java.lang.String s1 = "ABCDEFGhijkLMNOpqrstuvwxyz1234567890!";
    java.lang.String s2 = "hijkLMNOPQrstuvwxyZ1234567890!abcdeFG";
    boolean areRotated = p8.isRotation(s1, s2);
    assertTrue(areRotated);
    areRotated = p8.isRotation(s2, s1);
    assertTrue(areRotated);
}