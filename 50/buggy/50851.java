public java.lang.String getRootCaseID() {
    if ((_caseID) != null) {
        int firstDot = _caseID.indexOf('.');
        return firstDot > (-1) ? _caseID.substring(0, firstDot) : _caseID;
    }
    return _caseID;
}