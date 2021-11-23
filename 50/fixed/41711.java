private com.gradleware.tooling.toolingmodel.repository.ModelRepositoryProvider createModelRepositoryProvider() {
    com.gradleware.tooling.toolingclient.ToolingClient toolingClient = ((com.gradleware.tooling.toolingclient.ToolingClient) (this.toolingClientServiceTracker.getService()));
    return com.gradleware.tooling.toolingmodel.repository.ModelRepositoryProviderFactory.create(toolingClient);
}