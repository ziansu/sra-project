private void setupResources(configuration.KnapsackClientConfiguration config, io.dropwizard.setup.Environment environment) {
    final resources.KnapsackClientResource knapsackClientResource = new resources.KnapsackClientResource(environment, config, new resources.ClientBuilder());
    environment.jersey().register(knapsackClientResource);
    final resources.KnapsackClientInfoResource knapsackClientInfoResource = new resources.KnapsackClientInfoResource(config);
    environment.jersey().register(knapsackClientInfoResource);
}