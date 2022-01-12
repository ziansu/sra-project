@org.junit.Test
public void addToIndexShouldInsertElementToGivenIndex() throws java.lang.Exception {
    list.add(10);
    list.add(20);
    list.add(30);
    list.add(40, 1);
    assertEquals(new java.lang.Integer(40), list.get(1));
}