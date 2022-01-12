private void cleanup(org.exist.xquery.XQueryContext evalContext, org.exist.xquery.XQueryContext innerContext, org.exist.dom.persistent.DocumentSet oldDocs, org.exist.xquery.LocalVariable mark, org.exist.xquery.value.Item expr, org.exist.xquery.value.Sequence resultSequence) {
    if (innerContext != evalContext) {
        innerContext.reset();
    }
    if (oldDocs != null) {
        evalContext.setStaticallyKnownDocuments(oldDocs);
    }
    evalContext.popLocalVariables(mark);
    evalContext.popNamespaceContext();
    if (evalContext.isProfilingEnabled(2)) {
        evalContext.getProfiler().end(this, ("eval: " + expr), resultSequence);
    }
}