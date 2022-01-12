public void testConstructor() {
    main.LocalMap localMap = new main.LocalMap("sample.jpg", null);
    assertEquals(1.0, localMap.getMapScale());
}