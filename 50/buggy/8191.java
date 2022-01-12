public double getNetAmount() {
    return ((((grossAmount) - (federalWithholdingTax)) - (stateWithholdingTax)) - (medicareWithholdingTax)) - (socialSecurityWithholdingTax);
}