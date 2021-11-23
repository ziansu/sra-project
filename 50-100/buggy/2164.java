public java.util.ArrayList<ContractCop.norms.Norm> checkViolations() {
    java.util.ArrayList<ContractCop.norms.Norm> violations = new java.util.ArrayList<>();
    for (ContractCop.norms.Norm n : this.getActiveNorms()) {
        if (!(checkNorm(n))) {
            violations.add(n);
            break;
        }
    }
    return violations;
}