@org.junit.Test
public void it_should_call_evaluateProcessInitialExpressions() throws java.lang.Exception {
    final long processDefinitionID = 1;
    final long activityInstanceID = -1;
    formWorkflowAPIImpl.getEvaluateConditionExpressions(session, actions, locale, context, processDefinitionID, activityInstanceID, formExpressionsAPI);
    org.mockito.Mockito.verify(formExpressionsAPI).evaluateProcessInitialExpressions(session, processDefinitionID, expressions, locale, context);
    org.mockito.Mockito.verify(formExpressionsAPI, org.mockito.Mockito.never()).evaluateActivityInitialExpressions(session, activityInstanceID, expressions, locale, true, context);
}