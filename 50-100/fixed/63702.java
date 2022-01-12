@java.lang.Override
protected void configure() {
    com.acuo.valuation.web.resources.MarginCallResourceTest.server = new okhttp3.mockwebserver.MockWebServer();
    com.acuo.valuation.providers.markit.services.MarkitEndPointConfig markitEndPointConfig = new com.acuo.valuation.providers.markit.services.MarkitEndPointConfig(com.acuo.valuation.web.resources.MarginCallResourceTest.server.url("/"), "", "", "username", "password", "0", "10000", "false");
    com.acuo.valuation.providers.clarus.services.ClarusEndPointConfig clarusEndPointConfig = new com.acuo.valuation.providers.clarus.services.ClarusEndPointConfig("host", "key", "api", "10000", "false", null);
    bind(com.acuo.valuation.providers.markit.services.MarkitEndPointConfig.class).toInstance(markitEndPointConfig);
    bind(com.acuo.valuation.providers.clarus.services.ClarusEndPointConfig.class).toInstance(clarusEndPointConfig);
}