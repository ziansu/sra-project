@java.lang.Override
public com.pacoapp.paco.shared.model2.ExperimentQueryResult getUsersAdministeredExperiments(java.lang.String email, org.joda.time.DateTimeZone timezone, java.lang.Integer limit, java.lang.String cursor) {
    com.pacoapp.paco.shared.model2.ExperimentIdQueryResult experimentIdsQueryResult = com.google.sampling.experiential.server.ExperimentAccessManager.getExistingExperimentIdsForAdmin(email, (limit == null ? limit = 0 : 1000), cursor);
    java.util.List<com.pacoapp.paco.shared.model2.ExperimentDAO> experiments = getExperimentsByIdInternal(experimentIdsQueryResult.getExperiments(), email, timezone);
    return new com.pacoapp.paco.shared.model2.ExperimentQueryResult(experimentIdsQueryResult.getCursor(), experiments);
}