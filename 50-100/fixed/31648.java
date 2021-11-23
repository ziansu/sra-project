public static com.kryptnostic.directory.v1.model.response.UserResponse fromUser(com.kryptnostic.directory.v1.principal.User user) {
    return new com.kryptnostic.directory.v1.model.response.UserResponse(user.getId(), user.getRealm(), user.getName(), user.getGivenName().get(), user.getFamilyName().get(), user.getEmail(), user.getGroups(), user.getAttributes());
}