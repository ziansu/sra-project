@java.lang.Override
public com.jaeksoft.searchlib.webservice.CommonResult status(java.lang.String use, java.lang.String login, java.lang.String key, java.lang.String name) {
    try {
        com.jaeksoft.searchlib.Client client = getLoggedClientAnyRole(use, login, key, Role.GROUP_SCHEDULER);
        ClientFactory.INSTANCE.properties.checkApi();
        return new com.jaeksoft.searchlib.webservice.scheduler.SchedulerResult(getJobItem(client, name));
    } catch (com.jaeksoft.searchlib.SearchLibException | java.lang.InterruptedException | java.io.IOException e) {
        throw new com.jaeksoft.searchlib.webservice.scheduler.CommonServiceException(e);
    }
}