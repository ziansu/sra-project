@org.testng.annotations.Test
public void can_evaluate_condition_with_two_dates_within_90_days_apart_expect_true() {
    org.gdl2.expression.ExpressionItem expressionItem = parseExpression("$gt0023.value<($gt0004.value+90,d)");
    inputMap.put("gt0023", asList(org.gdl2.datatypes.DvDateTime.valueOf("2014-04-10T18:18:00")));
    inputMap.put("gt0004", asList(org.gdl2.datatypes.DvDateTime.valueOf("2014-01-11T13:14:11")));
    value = interpreter.evaluateExpressionItem(expressionItem, inputMap);
    org.hamcrest.MatcherAssert.assertThat(value, org.hamcrest.Matchers.is(true));
}