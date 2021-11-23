@ge.softgen.loanexpert.model.PostLoad
private void loadPermissions() {
    if ((secUserRoles) != null) {
        for (ge.softgen.loanexpert.model.SecUserRole secUserRole : secUserRoles) {
            ge.softgen.loanexpert.model.SecRole secRole = secUserRole.getSecRole();
            if (secRole != null) {
                java.util.List<ge.softgen.loanexpert.model.SecRolePermission> secRolePermissions = secRole.getSecRolePermissions();
                if (secRolePermissions != null) {
                    for (ge.softgen.loanexpert.model.SecRolePermission secRolePermission : secRolePermissions) {
                        ge.softgen.loanexpert.model.SecPermission secPermission = secRolePermission.getSecPermission();
                        if (secPermission != null) {
                            permissionsSet.add(secPermission.getName());
                        }
                    }
                }
            }
        }
    }
}