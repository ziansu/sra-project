public <T> T get(long id, java.lang.Class<T> persistentClass) {
    org.hibernate.Criteria inFlowCriteria = this._createCriteria(persistentClass, "a");
    inFlowCriteria.add(createCriterion(Operator.EQUALS, "a.id", id));
    java.util.List result = this._list(0, 1, inFlowCriteria);
    if ((result != null) && ((result.size()) > 0)) {
        return ((T) (result.get(0)));
    }
    return null;
}