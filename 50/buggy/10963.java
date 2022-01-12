public java.lang.Boolean verifyEquals(java.lang.String strKeyName, java.lang.String strLowerCaseValue) {
    return this.get(strKeyName).toString().toLowerCase().equals(strLowerCaseValue);
}