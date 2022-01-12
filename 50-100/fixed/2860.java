@org.junit.Test
public void testToJSONString() throws java.lang.Exception {
    startMarker();
    karyon.json.DefaultVisibilityCheckerTest.TestClass loClass = new karyon.json.DefaultVisibilityCheckerTest.TestClass();
    loClass.setStringValue("TEST STRING VALUE");
    java.lang.String lcJSON = karyon.json.Utilities.toJSONString(loClass);
    karyon.json.DefaultVisibilityCheckerTest.TestClass loClass2 = karyon.json.Utilities.toObject(lcJSON, karyon.json.DefaultVisibilityCheckerTest.TestClass.class);
    assertEquals(loClass.getAValue(), loClass2.getAValue());
    assertEquals(loClass.getBValue(), loClass2.getBValue());
    assertEquals(loClass.m_cStringValue, loClass2.m_cStringValue);
}