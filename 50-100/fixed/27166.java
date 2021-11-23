@org.junit.Test
public void testGetRoleList() throws java.lang.Exception {
    log.info("testGetRoleList");
    java.util.List<com.wzq.mybatis.model.Role> roleList = roleDao.getRoleList(1);
    log.info(("roleList:" + (roleList.size())));
    for (com.wzq.mybatis.model.Role role : roleList) {
        printRoleInfo(role.getRolename());
    }
}