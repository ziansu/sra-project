public synchronized nz.org.nesi.common.db.project.pojo.Project getProjectByProjectCode(final java.lang.String projectCode) throws java.lang.Exception {
    final nz.org.nesi.common.db.project.pojo.Project p = ((nz.org.nesi.common.db.project.pojo.Project) (getSqlSession().selectOne("getProjectByCode", projectCode)));
    if (p != null) {
        final nz.org.nesi.common.db.project.pojo.ProjectType t = ((nz.org.nesi.common.db.project.pojo.ProjectType) (getSqlSession().selectOne("getProjectTypeById", p.getProjectTypeId())));
        p.setProjectTypeName(t.getName());
        p.setStatusName(getProjectStatusById(p.getStatusId()));
    }
    return p;
}