@org.junit.Test
public void test6LetterWord() throws java.lang.Exception {
    this.wordJumble.setWordLength(6);
    org.junit.Assert.assertEquals(6, this.wordJumble.scramble().length(), edu.westga.cs6242.wordjumble.ModelWordJumbleTest.RANGE);
}