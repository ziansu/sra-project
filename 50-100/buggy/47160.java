@org.junit.Test(expected = org.takes.facets.auth.codecs.DecodingException.class)
public void decodesNonBaseSixtyFourAlphabetSymbols() throws java.io.IOException {
    try {
        new org.takes.facets.auth.codecs.CcStrict(new org.takes.facets.auth.codecs.CcBase64(new org.takes.facets.auth.codecs.CcPlain())).decode(" ^^^".getBytes());
    } catch (final org.takes.facets.auth.codecs.DecodingException ex) {
        org.hamcrest.MatcherAssert.assertThat(ex.getMessage(), org.hamcrest.Matchers.equalTo("Illegal character in Base64 encoded data. [32, 94, 94, 94]"));
        throw new org.takes.facets.auth.codecs.DecodingException("Illegal character in Base64 encoded data. %s");
    }
}