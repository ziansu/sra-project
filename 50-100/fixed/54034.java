private void checkFields() {
    check_fields.CallFieldsChecker callFieldsChecker = new check_fields.CallFieldsChecker(jsonResponse);
    caller = callFieldsChecker.checkHashCode(callerUsername, callerHashCode);
    if ((caller) == null) {
        fieldsAreOk = false;
        return ;
    }
    calleeIpAddress = callFieldsChecker.checkIfCalleeIsOnline(calleeUsername);
    if ((calleeIpAddress) == null) {
        fieldsAreOk = false;
        return ;
    }
    if (!(callFieldsChecker.checkPortLegality(callerPort))) {
        fieldsAreOk = false;
        return ;
    }
}