@java.lang.Override
public java.util.List<ch.uzh.ifi.feedback.orchestrator.model.Application> GetAll() throws java.sql.SQLException, javassist.NotFoundException {
    java.util.List<ch.uzh.ifi.feedback.orchestrator.model.Application> apps = super.GetAll();
    for (ch.uzh.ifi.feedback.orchestrator.model.Application app : apps) {
        app.getConfigurations().addAll(configurationService.GetWhereEquals(java.util.Arrays.asList("application_id"), java.util.Arrays.asList(app.getId())));
        app.setGeneralConfiguration(generalConfigurationService.GetById(app.getGeneralConfigurationId()));
    }
    return apps;
}