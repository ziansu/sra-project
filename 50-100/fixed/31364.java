@org.springframework.web.bind.annotation.RequestMapping(value = "/query", method = org.springframework.web.bind.annotation.RequestMethod.POST)
@org.springframework.web.bind.annotation.ResponseBody
@com.codahale.metrics.annotation.Timed(name = "query")
public com.kylinolap.rest.response.SQLResponse query(@org.springframework.web.bind.annotation.RequestBody
com.kylinolap.rest.request.SQLRequest sqlRequest) {
    long startTimestamp = java.lang.System.currentTimeMillis();
    com.kylinolap.rest.response.SQLResponse response = doQuery(sqlRequest);
    response.setDuration(((java.lang.System.currentTimeMillis()) - startTimestamp));
    queryService.logQuery(sqlRequest, response, new java.util.Date(startTimestamp), new java.util.Date(java.lang.System.currentTimeMillis()));
    return response;
}