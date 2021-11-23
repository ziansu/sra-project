@org.junit.Test
public void emptyWord() {
    piglatin.PigLatinTranslator plt = new piglatin.PigLatinTranslator();
    org.junit.Assert.assertEquals("", plt.translate(""));
    org.junit.Assert.assertEquals(null, plt.translate(null));
}