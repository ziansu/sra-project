@org.junit.Test
public void testTwoFloor() throws PathNotFoundException {
    SubPath expected1 = new SubPath("A");
    expected1.path.add(A1);
    expected1.path.add(A2);
    SubPath expected2 = new SubPath("B");
    expected2.path.add(B1);
    java.util.ArrayList<SubPath> expSubPath = new java.util.ArrayList<>();
    expSubPath.add(expected1);
    expSubPath.add(expected2);
    assertEquals("Sub path should be one floor", expSubPath, map.getPathByFloor(A1, B1));
}