@org.junit.Test
public void doesNotPrefixQualifiedRelsForRelAsString() {
    assertThat(provider.getNamespacedRelFor("custom:rel"), is("custom:rel"));
}