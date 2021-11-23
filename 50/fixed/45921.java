@org.junit.Test(expected = com.spencer.InvalidTriangleSidesException.class)
public void triangleExceptionLargeTest() throws com.spencer.InvalidTriangleSidesException {
    java.lang.Double largeNum = java.lang.Double.parseDouble("9e9999999999999999999999999999999999999999999999999999999999999999999999999999999999");
    triangleExceptionLarge = new com.spencer.Triangle(largeNum, largeNum, largeNum);
}