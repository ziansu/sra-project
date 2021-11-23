public void showUsersWithRole(java.lang.String role, java.util.List<dto.UserDTO> userArray) {
    for (dto.UserDTO user : userArray) {
        java.lang.String roles = userRoles(user);
        if (roles.contains(role)) {
            printUser(user, roles);
        }
    }
}