public void testFound1() {
    java.util.ArrayList<java.lang.Integer> array = new java.util.ArrayList<>(java.util.Arrays.asList(5));
    assertTrue(((new com.mycompany.app.App().search(array, 4, 6)) > 0));
}