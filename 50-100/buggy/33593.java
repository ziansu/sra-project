public gobblin.converter.HttpJoinConverter init(gobblin.configuration.WorkUnitState workUnitState) {
    super.init(workUnitState);
    com.typesafe.config.Config config = gobblin.config.ConfigBuilder.create().loadProps(workUnitState.getProperties(), gobblin.converter.HttpJoinConverter.CONF_PREFIX).build();
    config.withFallback(gobblin.converter.HttpJoinConverter.DEFAULT_FALLBACK);
    httpClient = createHttpClient(config, workUnitState.getTaskBroker());
    responseHandler = createResponseHandler(config);
    requestBuilder = createRequestBuilder(config);
    return this;
}