private boolean isPolicyCombinationValid(java.lang.String... policyNames) {
    boolean isValid = false;
    java.lang.String firstPolicyName = policyNames[0];
    for (java.lang.String policyName : policyNames) {
        if (!(policyName.equals(firstPolicyName))) {
            isValid = true;
            break;
        }
    }
    return isValid;
}