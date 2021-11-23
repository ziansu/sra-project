public boolean compareStrings(java.lang.String LHS, java.lang.String RHS, java.lang.String operator) {
    int operationType = determineComparisonOperator(operator);
    if (operationType == 0) {
        if (LHS.equals(RHS)) {
            return false;
        }else {
            return true;
        }
    }else {
        if (!(LHS.equals(RHS))) {
            return false;
        }else {
            return true;
        }
    }
}