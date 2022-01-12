@java.lang.Override
public ch.uzh.ifi.feedback.orchestrator.model.Application GetById(int id) throws java.sql.SQLException, javassist.NotFoundException {
    ch.uzh.ifi.feedback.orchestrator.model.Application app = super.GetById(id);
    app.getConfigurations().addAll(configurationService.GetWhereEquals(java.util.Arrays.asList("application_id"), java.util.Arrays.asList(id)));
    if ((app.getGeneralConfigurationId()) != null)
        app.setGeneralConfiguration(generalConfigurationService.GetById(app.getGeneralConfigurationId()));
    
    return app;
}