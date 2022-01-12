private void setGenericRoles(org.openforis.collect.model.User user) {
    if (user != null) {
        org.openforis.collect.model.UserRole role = org.openforis.collect.model.UserRole.ADMIN;
        user.setRoles(java.util.Arrays.asList(role));
    }
}