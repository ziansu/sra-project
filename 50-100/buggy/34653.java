@javax.annotation.security.PermitAll
@ru.sulion.webapplications.resources.GET
@ru.sulion.webapplications.resources.Path(value = "statistic/{accountId}")
public java.util.Map<java.lang.String, java.lang.Integer> retrieveStatistics(@ru.sulion.webapplications.resources.PathParam(value = "accountId")
java.lang.String accountId, @javax.ws.rs.core.Context
javax.ws.rs.core.SecurityContext securityContext) {
    if (securityContext.getUserPrincipal().getName().equals(accountId)) {
        statisticsStore.requestStatistics(accountService.getRecordsFor(accountId));
    }
    throw new ru.sulion.webapplications.resources.ForbiddenException("You may see only your own statistics");
}