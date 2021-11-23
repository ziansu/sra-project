public boolean addExpectedGlobalVariable(java.lang.String variable, boolean writing) {
    variable = variable.trim().toLowerCase();
    if (variable.equals("the-other")) {
        return false;
    }
    if (variable.equals("the-global-susceptibles")) {
        java.lang.System.out.println("debug this");
    }
    if (!(expectedGlobalVariables.contains(variable))) {
        expectedGlobalVariables.add(variable);
        return true;
    }
    return false;
}