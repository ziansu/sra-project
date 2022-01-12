@org.testng.annotations.Test
public void testEvaluateMarkedWithMarked() {
    pl.otros.logview.accept.query.org.apache.log4j.rule.Rule rule = pl.otros.logview.accept.query.org.apache.log4j.rule.MarkEqualsRule.getRule("true");
    boolean evaluate = rule.evaluate(ldBlack, new java.util.HashMap<>());
    org.testng.AssertJUnit.assertTrue(evaluate);
}