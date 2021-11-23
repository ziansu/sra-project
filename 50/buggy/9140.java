@org.junit.Test
public void testCountVowels() throws java.lang.Exception {
    int vowels = com.jetbrains.testing.Alphabet.countVowels(s);
    org.junit.Assert.assertEquals(16, vowels);
}