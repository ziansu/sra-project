@org.junit.Test
public void canExtractValuesFromStrings() {
    org.junit.Assert.assertEquals("x", com.hartwig.hmftools.ecrfanalyser.reader.CodeListFactory.fromText("1=x"));
    org.junit.Assert.assertEquals(Strings.EMPTY, com.hartwig.hmftools.ecrfanalyser.reader.CodeListFactory.fromText("hi"));
}