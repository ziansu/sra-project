private com.qa.cdstore.model.CD findCD(java.lang.Integer id) {
    return em.find(com.qa.cdstore.model.CD.class, id);
}