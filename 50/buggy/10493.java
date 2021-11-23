@org.junit.Test
public void t05eContainsInOrder() {
    java.util.Set<java.lang.String> col1 = new java.util.HashSet<java.lang.String>(java.util.Arrays.asList("v1", "v2", "v3"));
    org.hamcrest.MatcherAssert.assertThat(col1, org.hamcrest.collection.IsIterableContainingInOrder.contains("v1", "v2", "v3"));
}