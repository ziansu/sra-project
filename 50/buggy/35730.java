@java.lang.Override
public void blockUser(by.netcracker.hotel.entities.User user) {
    user = getUserByUsername(user.getUsername());
    user.setAuthority(ROLE.BLOCKED);
    update(user.toDTO());
}