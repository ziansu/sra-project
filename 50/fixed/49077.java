public java.lang.String currentTrace() {
    java.util.Deque<org.jboss.byteman.rule.helper.Helper.Span> localSpans = org.jboss.byteman.rule.helper.Helper.spans.get();
    if (localSpans.isEmpty()) {
        return org.jboss.byteman.rule.helper.Helper.NOT_TRACED;
    }
    return localSpans.peek().traceId;
}