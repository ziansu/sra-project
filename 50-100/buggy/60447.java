@org.junit.Test
public void should_fail_when_range_does_not_contain_expected_values() {
    final com.google.common.collect.Range<java.lang.Integer> actual = com.google.common.collect.Range.closedOpen(1, 10);
    expectException(java.lang.AssertionError.class, java.lang.String.format(("%nExpecting:%n" + ((((" <[1‥10)>%n" + "to contain:%n") + " <[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]>%n") + "but could not find:%n") + " <[10]>%n"))));
    org.assertj.guava.api.Assertions.assertThat(actual).contains(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
}