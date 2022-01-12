public vs.admin.features.admin.constituency.Constituency findConstituencyById(java.lang.Integer id) {
    vs.admin.features.admin.constituency.Constituency constituency = entityManager.find(vs.admin.features.admin.constituency.Constituency.class, id);
    if ((constituency != null) && ((constituency.getDeletedTime()) == null)) {
        return constituency;
    }
    return null;
}