@org.junit.Test
public void t05eContainsInOrder() {
    java.util.List<java.lang.String> list = java.util.Arrays.asList("v1", "v2", "v3");
    org.hamcrest.MatcherAssert.assertThat(list, org.hamcrest.collection.IsIterableContainingInOrder.contains("v1", "v2", "v3"));
}