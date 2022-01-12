@org.junit.Test
public void multiArrayCreated() {
    int[][] array = new int[2][3];
    org.junit.Assert.assertEquals(2, array.length);
    org.junit.Assert.assertEquals(3, array[0].length);
    org.junit.Assert.assertEquals(int[][].class, array.getClass());
    org.junit.Assert.assertEquals(int[].class, array[0].getClass());
}