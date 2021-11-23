@org.junit.Test
public void testSetLevel() {
    test.setLevel(2);
    org.junit.Assert.assertEquals("Level: 2", test.getLevelLabel().getText());
}