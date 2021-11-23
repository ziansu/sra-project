@org.junit.Test
public void should_getScriptFromCache_return_different_script_if_different_definition() throws java.lang.Exception {
    final groovy.lang.Script script1 = groovyScriptExpressionExecutorCacheStrategy.getScriptFromCache("MyScriptContent", 12L);
    final groovy.lang.Script script2 = groovyScriptExpressionExecutorCacheStrategy.getScriptFromCache("MyScriptContent", 13L);
    org.assertj.core.api.Assertions.assertThat(script1).isNotNull();
    org.assertj.core.api.Assertions.assertThat(script2).isNotNull();
    org.assertj.core.api.Assertions.assertThat(script1).isNotEqualTo(script2);
}