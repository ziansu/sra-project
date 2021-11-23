@java.lang.Override
@java.lang.SuppressWarnings(value = "unchecked")
public java.util.List<org.n52.series.api.v1.db.da.beans.ProcedureEntity> getAllInstances(org.n52.series.api.v1.db.da.DbQuery parameters) throws org.n52.series.api.v1.db.da.DataAccessException {
    org.hibernate.Criteria criteria = getDefaultCriteria("procedure");
    if (hasTranslation(parameters, org.n52.series.api.v1.db.da.beans.I18nProcedureEntity.class)) {
        parameters.addLocaleTo(criteria, org.n52.series.api.v1.db.da.beans.I18nProcedureEntity.class);
    }
    criteria = parameters.addDetachedFilters("procedure", criteria);
    parameters.addPagingTo(criteria);
    return ((java.util.List<org.n52.series.api.v1.db.da.beans.ProcedureEntity>) (criteria.list()));
}