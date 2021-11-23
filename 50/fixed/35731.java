private static void assertContainsElements(final java.util.Set<java.lang.Integer> other) {
    assertThat(other, org.hamcrest.Matchers.containsInAnyOrder(1, 1001));
}