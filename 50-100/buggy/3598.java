@org.junit.Test
public void testNull() {
    int nullId = dict.getIdFromValue(null);
    assertNull(dict.getValueFromId(nullId));
    int nullId2 = dict.getIdFromValueBytes(null, 0, 0);
    assertEquals(dict.getValueBytesFromId(nullId2, null, 0), 0);
    assertEquals(nullId, nullId2);
}