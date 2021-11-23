public boolean isBusinessObjectValid(org.kuali.rice.kns.bo.BusinessObject businessObject, java.lang.String prefix) {
    final org.kuali.rice.kns.util.MessageMap errorMap = org.kuali.rice.kns.util.GlobalVariables.getMessageMap();
    int originalErrorCount = errorMap.getErrorCount();
    errorMap.addToErrorPath(prefix);
    validateBusinessObject(businessObject);
    errorMap.removeFromErrorPath(prefix);
    return (errorMap.getErrorCount()) == originalErrorCount;
}