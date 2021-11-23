private void refreshCheckStatus(canreg.common.database.DatabaseRecord record) {
    if ((checkVariableListElement) != null) {
        java.lang.Object checkStatus = record.getVariable(checkVariableListElement.getDatabaseVariableName());
        if (checkStatus != null) {
            java.lang.String checkStatusString = ((java.lang.String) (checkStatus));
            resultCode = canreg.common.qualitycontrol.CheckResult.toResultCode(checkStatusString);
            setChecksResultCode(resultCode);
        }else {
            setChecksResultCode(ResultCode.NotDone);
        }
    }
}