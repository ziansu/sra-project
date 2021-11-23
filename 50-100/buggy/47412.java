public org.support.project.web.entity.GroupsEntity getGroup(java.lang.Integer groupId, org.support.project.web.bean.LoginedUser loginedUser) {
    org.support.project.web.dao.GroupsDao groupsDao = org.support.project.web.dao.GroupsDao.get();
    org.support.project.web.entity.GroupsEntity group;
    if (loginedUser.isAdmin()) {
        group = groupsDao.selectOnKey(groupId);
    }else {
        group = groupsDao.selectAccessAbleGroup(groupId, loginedUser);
    }
    setGroupStatus(group, loginedUser);
    return group;
}