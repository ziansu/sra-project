@org.junit.jupiter.api.Test
public void testPhysEquals3() {
    ph2.setLocations(new java.util.ArrayList<org.Point>(java.util.Arrays.asList(p1, p2)));
    ph1.setLocations(new java.util.ArrayList<org.Point>(java.util.Arrays.asList(p1, p2)));
    org.junit.jupiter.api.Assertions.assertEquals(true, ph1.equals(ph2));
    ph2.setLocations(new java.util.ArrayList<org.Point>());
    ph1.setLocations(new java.util.ArrayList<org.Point>());
}