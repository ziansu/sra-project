@org.springframework.web.bind.annotation.RequestMapping(value = "/results/test/{testRunId}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.springframework.http.ResponseEntity<java.util.List<pl.cloudy.models.ActionResult>> getTestFromAGivenDay(@org.springframework.web.bind.annotation.PathVariable(value = "testRunId")
int testRunId) {
    java.util.List<pl.cloudy.models.ActionResult> testRunResults = actionObjectService.findTestRunResults(testRunId);
    if (testRunResults.isEmpty()) {
        return new org.springframework.http.ResponseEntity(org.springframework.http.HttpStatus.NO_CONTENT);
    }
    org.springframework.http.HttpHeaders responseHeaders = new org.springframework.http.HttpHeaders();
    responseHeaders.set("Access-Control-Allow-Origin", "*");
    return new org.springframework.http.ResponseEntity(testRunResults, responseHeaders, org.springframework.http.HttpStatus.OK);
}