@java.lang.SuppressWarnings(value = "rawtypes")
public org.liveSense.misc.queryBuilder.operators.AbstractOperator setCriterias(org.liveSense.misc.queryBuilder.criterias.AbstractCriteria[] criteria) {
    params = new java.util.ArrayList();
    addParamsObject(criteria);
    return this;
}