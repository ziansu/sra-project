@org.junit.Test
public void testStreamingWithoutLocations() throws java.lang.Exception {
    org.elasticsearch.common.io.stream.BytesStreamOutput out = new org.elasticsearch.common.io.stream.BytesStreamOutput();
    io.crate.metadata.Routing routing1 = new io.crate.metadata.Routing(com.google.common.collect.ImmutableMap.<java.lang.String, java.util.Map<java.lang.String, java.util.List<java.lang.Integer>>>of());
    routing1.writeTo(out);
    org.elasticsearch.common.io.stream.StreamInput in = out.bytes().streamInput();
    io.crate.metadata.Routing routing2 = io.crate.metadata.Routing.fromStream(in);
    assertThat(routing1.locations(), org.hamcrest.Matchers.is(routing2.locations()));
}