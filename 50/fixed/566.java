private java.lang.Long printUsername(java.lang.String username) {
    ro.msg.edu.business.user.dto.UserDTO user = new ro.msg.edu.business.user.dto.UserDTO();
    user = userService.findUserByUsername(username);
    return user.getId();
}