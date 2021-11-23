public void testNoContextStartAndEndSame() {
    java.lang.String failure = new junit.framework.ComparisonCompactor(0, "abc", "adc").compact(null);
    assertEquals("expected:<...[b]...> but was:<...[d]...>", failure);
}