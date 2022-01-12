@java.lang.Override
public org.python.core.PyObject __or__(org.python.core.PyObject obj) {
    if (obj instanceof org.gephi.scripting.wrappers.GyFilter) {
        org.gephi.filters.api.FilterController filterController = org.openide.util.Lookup.getDefault().lookup(org.gephi.filters.api.FilterController.class);
        org.gephi.filters.plugin.operator.UNIONBuilder.UnionOperator unionOperator = new org.gephi.filters.plugin.operator.UNIONBuilder.UnionOperator();
        org.gephi.filters.api.Query orQuery = filterController.createQuery(unionOperator);
        org.gephi.scripting.wrappers.GyFilter otherFilter = ((org.gephi.scripting.wrappers.GyFilter) (obj));
        filterController.setSubQuery(orQuery, underlyingQuery);
        filterController.setSubQuery(orQuery, otherFilter.underlyingQuery);
        return new org.gephi.scripting.wrappers.GyFilter(namespace, orQuery);
    }
    return null;
}