@org.testng.annotations.Test
public void testEvaluateNotMarkedWithMarked() {
    pl.otros.logview.accept.query.org.apache.log4j.rule.Rule rule = pl.otros.logview.accept.query.org.apache.log4j.rule.MarkEqualsRule.getRule("false");
    boolean evaluate = rule.evaluate(ldBlack, new java.util.HashMap<>());
    org.testng.AssertJUnit.assertFalse(evaluate);
}