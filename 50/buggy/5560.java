public org.hibernate.Criteria setResultTransformer(org.hibernate.transform.ResultTransformer resultTransformer) {
    this.resultTransformer = resultTransformer;
    return this.entityManagerCriteria.setResultTransformer(resultTransformer);
}