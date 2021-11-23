@com.pholser.junit.quickcheck.Property
public void splitAt_Singleton_WithoutDelimiter(@nl.quintor.kennissessie.pbt.ReadableCharacter
final char delimiter, @nl.quintor.kennissessie.pbt.ReadableString
final java.lang.String toSplit) {
    org.junit.Assume.assumeThat(toSplit, not(containsString(java.lang.Character.toString(delimiter))));
    final java.lang.String withoutDelimiter = toSplit.replace(java.lang.Character.toString(delimiter), "");
    org.hamcrest.MatcherAssert.assertThat(nl.quintor.kennissessie.pbt.strings.StringUtils.splitAt(delimiter, withoutDelimiter), is(java.util.Arrays.asList(toSplit)));
}