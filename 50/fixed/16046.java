@org.junit.Test
public void prefixesNormalRelsForRelAsString() {
    assertThat(provider.getNamespacedRelFor("book"), is("acme:book"));
}