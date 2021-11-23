@org.junit.Test
public void test_diapason_from_boundaries() throws java.lang.Exception {
    instruction.primitives.InstructionDiapason diapason = new instruction.primitives.InstructionDiapason(word1, word4);
    assertFalse(diapason.contains(word0));
    assertTrue(diapason.contains(word1));
    assertTrue(diapason.contains(word2));
    assertTrue(diapason.contains(word3));
    assertTrue(diapason.contains(word4));
    assertFalse(diapason.contains(word5));
}