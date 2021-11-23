@my.epam.collections.Test
@my.epam.collections.Ignore
public void sizeShouldReturnIntMaxValueIfMapSizeMoreThenIntMaxValue() throws java.lang.Exception {
    java.lang.reflect.Field sizeField = list.getClass().getDeclaredField("size");
    sizeField.setAccessible(true);
    sizeField.set(list, java.lang.Integer.MAX_VALUE);
    assertEquals(java.lang.Integer.MAX_VALUE, list.size());
    list.add(10);
    assertEquals(java.lang.Integer.MAX_VALUE, list.size());
    sizeField.set(list, 0);
}