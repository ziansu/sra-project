@org.junit.Test
public void setPrimitiveArray() {
    java.lang.reflect.Array.set(new boolean[]{ true }, 0, false);
    int[] arr = new int[]{ 5 , 4 , 5 , 7 };
    java.lang.reflect.Array.set(arr, 0, 0);
    assertEquals(0, java.lang.reflect.Array.get(arr, 0));
}