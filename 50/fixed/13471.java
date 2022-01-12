public void testEmptyList() {
    java.util.ArrayList<java.lang.String> array = new java.util.ArrayList<>();
    assertFalse(new com.mycompany.app.App().search(array, 1, array));
}