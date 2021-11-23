@org.junit.Test
public void stringArrayCompactRoundtrip() throws com.pantor.blink.BlinkException, java.io.IOException {
    com.pantor.blink.TestCases.Strings s = new com.pantor.blink.TestCases.Strings();
    s.setValue(new java.lang.String[]{ "Foo" , "Bar" });
    com.pantor.blink.TestCases.Strings result = ((com.pantor.blink.TestCases.Strings) (com.pantor.blink.TestCases.compactRoundtrip("Strings -> string [] Value", s)));
    assertNotNull(result.getValue());
    assertEquals(2, result.getValue().length);
    assertEquals("Foo", result.getValue()[0]);
}