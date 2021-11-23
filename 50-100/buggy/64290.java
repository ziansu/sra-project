public java.lang.String eval(java.lang.String script) {
    try {
        java.lang.Object value = nashorn.eval((("yod('" + script) + "') + '';"));
        return value.toString();
    } catch (javax.script.ScriptException e) {
        log.error(((("script: " + script) + ", reason:") + (e.getMessage())));
    }
    return null;
}