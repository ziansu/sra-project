@org.junit.Test
public final void addCallerFilterToSearchBuilderIfNecessary_should_add_caller_filter_to_builder_when_filter_on_caller_with_value_different_of_any() {
    final java.util.Map<java.lang.String, java.lang.String> filters = java.util.Collections.singletonMap(CaseItem.FILTER_CALLER, "9");
    final org.bonitasoft.engine.search.SearchOptionsBuilder builder = new org.bonitasoft.engine.search.SearchOptionsBuilder(0, 10);
    caseDatastore.addCallerFilterToSearchBuilderIfNecessary(filters, builder);
    final org.bonitasoft.engine.search.impl.SearchFilter searchFilter = builder.done().getFilters().get(0);
    assertEquals(ProcessInstanceSearchDescriptor.CALLER_ID, searchFilter.getField());
    assertEquals(9L, searchFilter.getValue());
}