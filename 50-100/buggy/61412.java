@java.lang.Override
public void run(com.github.nordinh.apidoc.ApiDocConfiguration configuration, io.dropwizard.setup.Environment environment) throws java.lang.Exception {
    final org.apache.http.client.HttpClient httpClient = new io.dropwizard.client.HttpClientBuilder(environment).using(configuration.getHttpClientConfiguration()).build("swagger");
    environment.jersey().setUrlPattern("/api/*");
    environment.jersey().register(new com.github.nordinh.apidoc.resources.DocumentedServices(configuration.getServices(), httpClient));
}