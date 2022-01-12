@java.lang.Override
public java.lang.Object evaluate(org.opencds.cqf.cql.execution.Context context) {
    java.lang.Object source = getSource().evaluate(context);
    java.lang.Integer start = ((java.lang.Integer) (getStartIndex().evaluate(context)));
    java.lang.Integer end = ((getEndIndex()) == null) ? null : ((java.lang.Integer) (getEndIndex().evaluate(context)));
    return context.logTrace(this.getClass(), org.opencds.cqf.cql.elm.execution.SliceEvaluator.slice(source, start, end), source, start, end);
}