@org.junit.Test
public void testOneFloor() throws PathNotFoundException {
    SubPath expected = new SubPath("A");
    expected.path.add(A1);
    expected.path.add(A2);
    java.util.ArrayList<SubPath> expSubPath = new java.util.ArrayList<>();
    expSubPath.add(expected);
    assertEquals("Sub path should be one floor", expSubPath, map.getPathByFloor(A1, A2));
}