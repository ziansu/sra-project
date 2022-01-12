private cabanas.garcia.ismael.opportunity.model.Roles getRolesFromRequest(java.lang.String stringOfRoles) {
    cabanas.garcia.ismael.opportunity.model.Roles roles = cabanas.garcia.ismael.opportunity.model.Roles.builder().roleList(new java.util.ArrayList<>()).build();
    if (stringOfRoles != null) {
        java.util.List<cabanas.garcia.ismael.opportunity.model.Role> rolesList = new java.util.ArrayList<>();
        java.lang.String[] rolesSplitted = stringOfRoles.split(",");
        for (int i = 0; i < (rolesSplitted.length); i++) {
            roles.add(rolesSplitted[i]);
        }
    }
    return roles;
}