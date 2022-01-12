private com.navercorp.pinpoint.bootstrap.instrument.matcher.operand.MatcherOperand joinOr(java.util.List<java.lang.String> basePackageNames) {
    if (basePackageNames.isEmpty()) {
        throw new java.lang.IllegalArgumentException("basePackageNames must not be empty ");
    }
    com.navercorp.pinpoint.bootstrap.instrument.matcher.operand.MatcherOperand operandGroup = null;
    for (java.lang.String basePackageName : basePackageNames) {
        if (operandGroup == null) {
            operandGroup = new com.navercorp.pinpoint.bootstrap.instrument.matcher.operand.PackageInternalNameMatcherOperand(basePackageName);
        }else {
            final com.navercorp.pinpoint.bootstrap.instrument.matcher.operand.MatcherOperand packageMatcherOperand = new com.navercorp.pinpoint.bootstrap.instrument.matcher.operand.PackageInternalNameMatcherOperand(basePackageName);
            operandGroup = operandGroup.or(packageMatcherOperand);
        }
    }
    return operandGroup;
}