@java.lang.Override
public java.util.List<ch.uzh.ifi.feedback.orchestrator.model.Configuration> GetAll() throws java.sql.SQLException, javassist.NotFoundException {
    java.util.List<ch.uzh.ifi.feedback.orchestrator.model.Configuration> configurations = super.GetAll();
    for (ch.uzh.ifi.feedback.orchestrator.model.Configuration config : configurations) {
        config.getFeedbackMechanisms().addAll(mechanismService.GetAllFor("configuration_id", config.getId()));
        if ((config.getGeneralConfigurationId()) != null)
            config.setGeneralConfiguration(generalConfigurationService.GetById(config.getGeneralConfigurationId()));
        
    }
    return configurations;
}