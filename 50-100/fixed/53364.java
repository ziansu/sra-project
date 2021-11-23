@org.junit.Test
public void streamFromEmptyArray() {
    java.util.stream.Stream<java.lang.Object> stream = org.cp.elements.util.stream.StreamUtils.stream();
    org.junit.Assert.assertThat(stream, org.hamcrest.Matchers.is(org.hamcrest.Matchers.notNullValue(java.util.stream.Stream.class)));
    org.junit.Assert.assertThat(stream.count(), org.hamcrest.Matchers.is(org.hamcrest.Matchers.equalTo(0L)));
}