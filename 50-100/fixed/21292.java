@org.junit.Test(expected = org.bonitasoft.engine.exception.SearchException.class)
public void searchFailedProcessInstances_should_throw_exception_when_transaction_content_failed() throws java.lang.Exception {
    final org.bonitasoft.engine.search.SearchOptions searchOptions = new org.bonitasoft.engine.search.SearchOptionsBuilder(0, 20).done();
    doThrow(new org.bonitasoft.engine.persistence.SBonitaReadException(new java.lang.Exception("plop"))).when(processInstanceService).getNumberOfFailedProcessInstances(any(org.bonitasoft.engine.persistence.QueryOptions.class));
    processAPI.searchFailedProcessInstances(searchOptions);
}