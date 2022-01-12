@my.epam.collections.Test
public void addToIndexShouldShiftNextElementsToRightPosition() throws java.lang.Exception {
    list.add(10);
    list.add(20);
    list.add(30);
    list.add(1, 40);
    assertEquals(new java.lang.Integer(30), list.get(3));
}