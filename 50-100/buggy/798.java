private com.navercorp.pinpoint.bootstrap.instrument.matcher.operand.MatcherOperand joinOr() {
    com.navercorp.pinpoint.bootstrap.instrument.matcher.operand.MatcherOperand operand = null;
    for (java.lang.String baseClassName : this.baseClassNames) {
        if (operand == null) {
            operand = new com.navercorp.pinpoint.bootstrap.instrument.matcher.operand.ClassInternalNameMatcherOperand(baseClassName);
        }else {
            final com.navercorp.pinpoint.bootstrap.instrument.matcher.operand.MatcherOperand classMatcherOperand = new com.navercorp.pinpoint.bootstrap.instrument.matcher.operand.ClassInternalNameMatcherOperand(baseClassName);
            operand = operand.or(classMatcherOperand);
        }
    }
    return operand;
}