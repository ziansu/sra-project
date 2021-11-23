private java.util.concurrent.Callable<io.restassured.response.Response> doRequest(final lv.ctco.cukes.http.HttpMethod method) {
    return () -> {
        final io.restassured.specification.RequestSpecification requestSpec = requestFacade.value();
        for (lv.ctco.cukes.http.extension.CukesHttpPlugin plugin : pluginSet) {
            plugin.beforeRequest(requestSpec);
        }
        response = method.doRequest(requestSpec);
        for (lv.ctco.cukes.http.extension.CukesHttpPlugin CukesPlugin : pluginSet) {
            CukesPlugin.afterRequest(response);
        }
        cacheHeaders(response);
        return response;
    };
}