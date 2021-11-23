@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.GET, value = "/resultsAnalysis/{id}", produces = "application/json")
public org.springframework.http.ResponseEntity<uk.co.olimor.BMBTApi_boot.response.ApiResponse> getResultsAnalysis(@org.springframework.web.bind.annotation.PathVariable(value = "id")
final java.lang.String userId) {
    log.entry(userId);
    try {
        final uk.co.olimor.BMBTApi_boot.model.ResultsAnalysis analysis = resultAnalysisBuilder.buildResultsAnalysis(resultHistoryQuery.getResultHistory(userId));
        return log.traceExit(new org.springframework.http.ResponseEntity<uk.co.olimor.BMBTApi_boot.response.ApiResponse>(new uk.co.olimor.BMBTApi_boot.response.ApiResponse(analysis), org.springframework.http.HttpStatus.OK));
    } catch (final uk.co.olimor.BMBTApi_boot.exception.ApiException e) {
        return log.traceExit(buildErrorResponse(e));
    }
}