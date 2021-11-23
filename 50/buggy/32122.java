@org.junit.Test
public void shouldGetChromaComplexityTonal() throws Chroma.WrongChromaSize {
    org.junit.Assert.assertEquals(0.8, org.harmony_analyser.chromanal.Chromanal.getChromaComplexityTonal(chroma1, chroma2), 0.01);
}