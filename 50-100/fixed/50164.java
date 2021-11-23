@org.junit.Test
public void sum() throws java.lang.Exception {
    PlayGround playGround = new PlayGround();
    java.util.List<java.lang.Integer> numbers;
    numbers = java.util.Arrays.asList(4, 5, 4, 3, 2);
    assertEquals(18, playGround.sum(numbers));
}