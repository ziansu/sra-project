@java.lang.Override
protected void visitEnvelopeTest(org.apache.jsieve.parser.generated.Node node, com.zimbra.cs.filter.VisitPhase phase, com.zimbra.cs.filter.RuleProperties props, java.util.List<java.lang.String> headers, com.zimbra.common.filter.Sieve.AddressPart part, com.zimbra.common.filter.Sieve.ValueComparison comparison, boolean isCount, java.lang.String value) {
    com.zimbra.soap.mail.type.FilterTest.EnvelopeTest test = addTest(new com.zimbra.soap.mail.type.FilterTest.EnvelopeTest(), props);
    visitAddress(test, phase, props, headers, part, comparison, isCount, value);
}