public synchronized java.lang.Object eval(java.lang.String script) {
    try {
        return nashorn.eval((("yod('" + script) + "') + '';")).toString();
    } catch (java.lang.Exception e) {
        log.error(((("script: " + script) + ", reason:") + (e.getMessage())));
    }
    return null;
}