private void assertScript(java.lang.String script, java.util.Map<java.lang.String, java.lang.Object> vars, org.hamcrest.Matcher<java.lang.Object> matcher) {
    java.lang.Object result = engine.executable(new org.elasticsearch.script.CompiledScript(org.elasticsearch.script.ScriptService.ScriptType.INLINE, "inline", "mustache", compile(script)), vars).run();
    assertThat(result, org.hamcrest.Matchers.notNullValue());
    assertThat(result, org.hamcrest.Matchers.instanceOf(org.elasticsearch.common.bytes.BytesReference.class));
    assertThat(((org.elasticsearch.common.bytes.BytesReference) (result)).toUtf8(), matcher);
}