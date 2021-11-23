public int compareStrings(java.lang.String LHS, java.lang.String RHS, java.lang.String operator) {
    int operationType = determineComparisonOperator(operator);
    if (operationType == 0) {
        if (LHS.equals(RHS)) {
            return 0;
        }else {
            return 1;
        }
    }else {
        if (!(LHS.equals(RHS))) {
            return 0;
        }else {
            return 1;
        }
    }
}