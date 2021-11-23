private boolean isPolicyCombinationValid(java.lang.String... policyNames) {
    boolean isValid = true;
    java.lang.String firstPolicyName = policyNames[0];
    for (java.lang.String policyName : policyNames) {
        if (!(policyName.equals(firstPolicyName))) {
            break;
        }
        isValid = false;
    }
    return isValid;
}