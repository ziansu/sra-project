@java.lang.Override
public java.lang.Object evaluate(org.opencds.cqf.cql.execution.Context context) {
    java.lang.Iterable<java.lang.Object> value = ((java.lang.Iterable<java.lang.Object>) (getOperand().evaluate(context)));
    java.util.Iterator<java.lang.Object> iterator = value.iterator();
    if (iterator.hasNext()) {
        return true;
    }
    return false;
}