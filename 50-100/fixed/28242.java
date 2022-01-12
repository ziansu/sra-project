@org.junit.Test
public void testOptimisticAlexandriaMarkupClientHasDelegatedUnwrappedMethodForEachRelevantMethodInAlexandriaMarkupClient() {
    java.lang.Class<nl.knaw.huygens.alexandria.markup.client.AlexandriaMarkupClient> a = nl.knaw.huygens.alexandria.markup.client.AlexandriaMarkupClient.class;
    java.lang.String stubs = java.util.Arrays.stream(a.getMethods()).filter(this::returnsRestResult).filter(this::hasNoDelegatedMethodInOptimisticAlexandriaMarkupClient).map(this::toDelegatedMethodStub).collect(java.util.stream.Collectors.joining("\n"));
    org.assertj.core.api.Assertions.assertThat(stubs).isEmpty();
}