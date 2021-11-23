public java.lang.Object execute(java.lang.String scriptName) {
    try {
        java.net.URI uri = this.getClass().getResource(scriptName).toURI();
        java.lang.String script = org.apache.commons.io.IOUtils.toString(uri, java.nio.charset.Charset.defaultCharset());
        return engine.eval(script);
    } catch (java.io.IOException | java.net.URISyntaxException | javax.script.ScriptException e) {
        log.error(e.getMessage(), e);
        throw new java.lang.RuntimeException(e);
    }
}