@org.junit.Test
public void testGetVisibleByVertexNum1() {
    java.lang.System.out.println("testGetVisibleByVertexNum");
    wslf.algo.World world = wslf.algo.VisibilityTest.getWorld2Polygons1();
    wslf.algo.Visibility instance = new wslf.algo.Visibility(world);
    java.util.LinkedList<java.lang.Integer> expResult = new java.util.LinkedList<>(java.util.Arrays.asList(0, 1, 2, 8, 9, 10, 11));
    java.util.LinkedList<java.lang.Integer> result = instance.getVisible(0);
    assertTrue(((expResult.containsAll(result)) && (result.containsAll(expResult))));
}