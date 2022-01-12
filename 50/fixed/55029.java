@org.junit.Test
public void testGetBotRight() {
    assertNull(plateauTest.getCase("I12").getSouth());
    assertNull(plateauTest.getCase("I12").getEast());
}