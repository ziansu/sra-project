public java.util.List<models.template.QA> findAllById(java.util.List<java.lang.Long> qaIds) throws exceptions.EntityNotFoundException {
    java.util.List<models.template.QA> qas = new java.util.ArrayList();
    for (java.lang.Long qa : qaIds) {
        qas.add(readById(qa));
    }
    return qas;
}