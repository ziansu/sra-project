@org.junit.Test
public void removeMissingValueShouldReturnNull() {
    org.junit.Assert.assertNull(map.remove(1));
    org.junit.Assert.assertEquals(0, map.size());
}