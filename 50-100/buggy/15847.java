@org.junit.Test
public final void addCallerFilterToSearchBuilderIfNecessary_should_add_caller_filter_to_builder_when_no_caller_filter() {
    final java.util.Map<java.lang.String, java.lang.String> filters = java.util.Collections.emptyMap();
    final org.bonitasoft.engine.search.SearchOptionsBuilder builder = new org.bonitasoft.engine.search.SearchOptionsBuilder(0, 10);
    caseDatastore.addCallerFilterToSearchBuilderIfNecessary(filters, builder);
    final org.bonitasoft.engine.search.impl.SearchFilter searchFilter = builder.done().getFilters().get(0);
    org.junit.Assert.assertEquals(ProcessInstanceSearchDescriptor.CALLER_ID, searchFilter.getField());
    org.junit.Assert.assertEquals((-1), searchFilter.getValue());
}