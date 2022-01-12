private java.lang.Object compile(java.lang.String script) {
    assertThat("cannot compile null or empty script", script, not(isEmptyOrNullString()));
    return engine.compile(script, java.util.Collections.<java.lang.String, java.lang.String>emptyMap());
}