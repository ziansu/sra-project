public java.lang.Object resolveResult(org.opencds.cqf.cql.execution.Context context, java.lang.Object element) {
    if (shouldInclude) {
        if ((this.getReturn()) != null)
            return this.getReturn().getExpression().evaluate(context);
        
    }
    return element;
}