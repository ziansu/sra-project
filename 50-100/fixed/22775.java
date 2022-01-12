private void addAdmin() {
    Albergo.User user = new Albergo.Employee(0, "admin", "admin", "admin");
    user.addPermission(User.Permissions.CAN_CHECKIN_OCCUPANT);
    user.addPermission(User.Permissions.CAN_CHECKOUT_OCCUPANT);
    user.addPermission(User.Permissions.CAN_SET_DISCOUNT);
    user.addPermission(User.Permissions.CAN_SET_OCCUPANT);
    user.addPermission(User.Permissions.CAN_CREATE_EMPLOYEE);
    user.addPermission(User.Permissions.CAN_MODIFY_BUILDING);
    this.users.add(user);
}