@org.junit.Test
public void multiArrayCreated() {
    int[][] array = new int[2][3];
    assertEquals(2, array.length);
    assertEquals(3, array[0].length);
    assertEquals(int[][].class, array.getClass());
    assertEquals(int[].class, array[0].getClass());
}