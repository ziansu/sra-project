@org.junit.Test
public void testAdd10() {
    java.lang.System.out.println("add");
    int b = 10;
    int[] x = new int[]{ 0 };
    int[] y = new int[]{ 1 , 2 };
    lekkerrekenen.Addition instance = new lekkerrekenen.Addition();
    int[] expResult = new int[]{ 1 , 2 };
    int[] result = instance.add(x, y, b);
    assertArrayEquals(expResult, result);
}