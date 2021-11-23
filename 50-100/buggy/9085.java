@org.junit.Test
public void shouldDeleteATemplateWithAGivenName() {
    com.thoughtworks.go.server.service.PipelineTemplateConfig emptyTemplate = template("empty_template");
    com.thoughtworks.go.server.service.CruiseConfig cruiseConfig = new com.thoughtworks.go.server.service.BasicCruiseConfig();
    cruiseConfig.addTemplate(emptyTemplate);
    service.removeTemplate("empty_template", cruiseConfig, "md5", new com.thoughtworks.go.server.service.result.HttpLocalizedOperationResult());
    org.mockito.Mockito.verify(goConfigService).updateConfig(new com.thoughtworks.go.server.service.DeleteTemplateCommand("empty_template", "md5"));
}