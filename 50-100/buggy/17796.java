@org.junit.Test
public final void addCallerFilterToSearchBuilderIfNecessary_should_do_nothing_when_filter_on_any_caller() {
    final java.util.Map<java.lang.String, java.lang.String> filters = java.util.Collections.singletonMap(CaseItem.FILTER_CALLER, "any");
    final org.bonitasoft.engine.search.SearchOptionsBuilder builder = new org.bonitasoft.engine.search.SearchOptionsBuilder(0, 10);
    caseDatastore.addCallerFilterToSearchBuilderIfNecessary(filters, builder);
    org.junit.Assert.assertTrue(builder.done().getFilters().isEmpty());
}