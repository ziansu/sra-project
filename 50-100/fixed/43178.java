@org.junit.Test
public void it_should_call_evaluateProcessInitialExpressions() throws java.lang.Exception {
    final long processDefinitionID = 1;
    final long activityInstanceID = -1;
    formWorkflowAPIImpl.getEvaluateConditionExpressions(session, actions, locale, context, processDefinitionID, activityInstanceID, formExpressionsAPI);
    verify(formExpressionsAPI).evaluateProcessInitialExpressions(session, processDefinitionID, expressions, locale, context);
    verify(formExpressionsAPI, never()).evaluateActivityInitialExpressions(session, activityInstanceID, expressions, locale, true, context);
}