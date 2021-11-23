@com.pholser.junit.quickcheck.Property
public void splitAt_Singleton_ForMissingDelimiter(@nl.quintor.kennissessie.pbt.ReadableString
final java.lang.String toSplit) {
    for (int i = 0; i < (toSplit.length()); i++) {
        final char delimiter = toSplit.charAt(i);
        final java.lang.String withoutDelimiter = toSplit.replace(java.lang.Character.toString(delimiter), "");
        org.hamcrest.MatcherAssert.assertThat(nl.quintor.kennissessie.pbt.strings.StringUtils.splitAt(delimiter, withoutDelimiter), is(java.util.Arrays.asList(toSplit)));
    }
}