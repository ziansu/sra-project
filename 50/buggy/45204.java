public vs.admin.features.admin.constituency.Constituency findConstituencyById(java.lang.Integer id) {
    vs.admin.features.admin.constituency.Constituency constituency = ((vs.admin.features.admin.constituency.Constituency) (entityManager.createQuery(vs.admin.features.admin.constituency.ConstituencyRepository.FIND_BY_ID).setParameter("id", id).getSingleResult()));
    return constituency;
}