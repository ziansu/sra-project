@java.lang.Override
public net.model.User takeInfo(net.model.UserLoginDTO userLoginDTO) {
    net.model.User user = new net.model.User();
    user.setUserLogin(user.getUserLogin());
    user.setUserPassword(user.getUserPassword());
    user.setUserEmail(user.getUserEmail());
    user.setUserStatus("cheked");
    return user;
}