public com.taobao.rigel.rap.project.service.impl.Project getProjectSummary(int id) {
    com.taobao.rigel.rap.project.service.impl.Project p = projectDao.getProjectSummary(id);
    if (p != null)
        p.setUser(accountMgr.getUser(p.getUserId()));
    
    return p;
}