public void validateUpdate() {
    com.innovaee.eorder.module.entity.Role role1 = roleService.loadRole(java.lang.Integer.parseInt(roleId));
    com.innovaee.eorder.module.entity.Role role2 = roleService.findRoleByRoleName(roleName);
    if ((null != role2) && (!(role1.getRoleId().equals(role2.getRoleId())))) {
        addFieldError("roleName", "角色名称已被占用！");
        refreshData();
    }
}