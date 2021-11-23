@org.junit.Test
public void it_should_not_call_evaluateProcessInitialExpressions_nor_evaluateActivityInitialExpressions() throws java.lang.Exception {
    final long processDefinitionID = -1;
    final long activityInstanceID = -1;
    formWorkflowAPIImpl.getEvaluateConditionExpressions(session, actions, locale, context, processDefinitionID, activityInstanceID, formExpressionsAPI);
    verify(formExpressionsAPI, never()).evaluateProcessInitialExpressions(session, processDefinitionID, expressions, locale, context);
    verify(formExpressionsAPI, never()).evaluateActivityInitialExpressions(session, activityInstanceID, expressions, locale, true, context);
}