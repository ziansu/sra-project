public utility.Solution learn(solverCore.ConstraintEngine constraintEngine) {
    utility.Solution result = new utility.Solution(this.problem, this.variables);
    for (utility.Variable vari : result.getUnassignedVariables()) {
        for (java.lang.Integer value : vari.getDomain()) {
            if (!(constraintEngine.checkSolution(this.setVariableOnNewSolution(vari, value)))) {
                vari.removeDomainValueOnNewVariable(value);
            }
            vari.setValue(null);
        }
    }
    return result;
}