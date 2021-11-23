public void testConstructor() {
    main.LocalMap localMap = new main.LocalMap("sample.jpg", null);
    assertEquals(0.123, localMap.getMapScale());
}