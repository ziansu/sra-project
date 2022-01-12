public java.util.List<com.pk.model.admin.SysOrg> loadByPidAndUserId(int pid, int userId) {
    java.util.List<com.pk.model.admin.SysOrg> list = null;
    java.lang.String cacheKey = java.lang.String.format(com.pk.service.admin.SysOrgService.KEY_PID_LIST_UID, pid, userId);
    list = getFromCache(cacheKey, java.util.List.class);
    if (list == null) {
        com.pk.vo.admin.SysOrgSearchVO svo = new com.pk.vo.admin.SysOrgSearchVO();
        svo.setPid(pid);
        svo.setCodes(getUserOrgCodes(userId));
        list = sysOrgDao.list(svo);
        putIntoCache(cacheKey, list);
    }
    return list;
}