@java.lang.Override
public ch.uzh.ifi.feedback.orchestrator.model.Configuration GetById(int id) throws java.sql.SQLException, javassist.NotFoundException {
    ch.uzh.ifi.feedback.orchestrator.model.Configuration config = super.GetById(id);
    config.getFeedbackMechanisms().addAll(mechanismService.GetAllFor("configuration_id", id));
    if ((config.getGeneralConfigurationId()) != null)
        config.setGeneralConfiguration(generalConfigurationService.GetById(config.getGeneralConfigurationId()));
    
    return config;
}