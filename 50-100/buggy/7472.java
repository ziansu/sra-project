@java.lang.Override
public void run(io.katharsis.example.dropwizardSimple.DropwizardConfiguration dropwizardConfiguration, io.dropwizard.setup.Environment environment) throws java.lang.Exception {
    environment.jersey().property(io.katharsis.rs.KatharsisProperties.RESOURCE_DEFAULT_DOMAIN, dropwizardConfiguration.katharsis.host);
    environment.jersey().property(io.katharsis.rs.KatharsisProperties.RESOURCE_SEARCH_PACKAGE, dropwizardConfiguration.katharsis.searchPackage);
    io.katharsis.rs.KatharsisFeature katharsisFeature = new io.katharsis.rs.KatharsisFeature(environment.getObjectMapper(), new io.katharsis.queryParams.QueryParamsBuilder(new io.katharsis.queryParams.DefaultQueryParamsParser()), new io.katharsis.locator.SampleJsonServiceLocator());
    environment.jersey().register(katharsisFeature);
}