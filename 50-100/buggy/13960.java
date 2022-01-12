@org.junit.Test
public void testBirthDescription() {
    assertNotNull(birth.description);
    assertNotNull(birth.description.value);
    java.lang.System.out.println(birth.description.value);
    assertTrue(birth.description.value.startsWith("This was entered"));
    assertTrue(birth.description.value.endsWith("laborum."));
    assertEquals(552, birth.description.value.length());
}