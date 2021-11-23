@java.lang.Override
public java.util.List<uk.co.olimor.BMBTApi_boot.model.TestResult> getResultHistory(final java.lang.String userId) throws uk.co.olimor.BMBTApi_boot.exception.ApiException {
    log.entry(userId);
    final java.util.List<uk.co.olimor.BMBTApi_boot.model.TestResult> results = query(java.lang.String.format(uk.co.olimor.BMBTApi_boot.dao.impl.ResultsHistoryQueryImpl.QUERY, userId));
    if ((results.size()) == 0)
        throw new uk.co.olimor.BMBTApi_boot.exception.ApiException("No results found for user id", org.springframework.http.HttpStatus.NOT_FOUND);
    
    return log.traceExit(results);
}