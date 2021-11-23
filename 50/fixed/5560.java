public org.hibernate.Criteria setResultTransformer(org.hibernate.transform.ResultTransformer resultTransformer) {
    this.resultTransformer = resultTransformer;
    if ((this.entityManagerCriteria) != null) {
        return this.entityManagerCriteria.setResultTransformer(resultTransformer);
    }else {
        return null;
    }
}