public org.jasig.ssp.util.sort.PagingWrapper<org.jasig.ssp.model.reference.Blurb> getAll(final org.jasig.ssp.util.sort.SortingAndPaging sAndP, java.lang.String code, java.lang.String langCode) {
    org.hibernate.Criteria criteria = createCriteria();
    if (code != null) {
        code = code.replace('*', '%');
        criteria.add(org.hibernate.criterion.Restrictions.like("code", code));
    }
    return super.processCriteriaWithStatusSortingAndPaging(criteria, sAndP);
}