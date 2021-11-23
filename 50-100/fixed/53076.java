@org.junit.Test
public void test() {
    org.sonar.api.server.rule.RulesDefinition.Context context = new org.sonar.api.server.rule.RulesDefinition.Context();
    org.junit.Assert.assertEquals(0, context.repositories().size());
    new org.sonar.plugins.fsharp.FSharpSonarRulesDefinition().define(context);
    org.junit.Assert.assertEquals(1, context.repositories().size());
    org.junit.Assert.assertEquals(43, context.repository("fsharplint").rules().size());
}